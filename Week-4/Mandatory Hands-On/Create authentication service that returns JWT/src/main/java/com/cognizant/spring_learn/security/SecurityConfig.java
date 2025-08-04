package com.cognizant.spring_learn.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request ->request
                        .requestMatchers("/").hasAnyRole("ADMIN","USER")
                        .requestMatchers("/country").hasRole("ADMIN")
                        .requestMatchers("/jwt").permitAll()
                        .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults())
                .build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder(10);
    }

    @Bean
    public UserDetailsService inMemoryUsers(PasswordEncoder passwordencoder){
        InMemoryUserDetailsManager userManager = new InMemoryUserDetailsManager();
        userManager.createUser(
                User
                        .withUsername("admin")
                        .password(passwordencoder.encode("pwd"))
                        .roles("ADMIN")
                        .build());
        userManager.createUser(
                User
                        .withUsername("user")
                        .password(passwordencoder.encode("pwd"))
                        .roles("USER")
                        .build());
        return userManager;
    }

}