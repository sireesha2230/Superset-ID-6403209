package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class countryService {

    public Country getCountry(String code){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        return context.getBean(code.toUpperCase(), Country.class);
    }
}