package com.cognizant.spring_learn.Controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @GetMapping("/")
    public String homePage(){
        return "Welcome to Home Page...";
    }

    @GetMapping("/country")
    public Country getCountryIndia(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("IN", Country.class);
        return country;
    }

    @Autowired
    CountryService service;

    @GetMapping("countries/{code}")
    @ResponseBody
    public Country getCountry(@PathVariable String code){
        return service.getCountry(code);
    }
}