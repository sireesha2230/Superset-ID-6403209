package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CountryController {

    @GetMapping("/")
    public String homePage() {
        return "Welcome to Home Page...";
    }

    @GetMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class); // Bean id should match the one in country.xml
        return country;
    }

    @Autowired
    private CountryService service;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }
}
