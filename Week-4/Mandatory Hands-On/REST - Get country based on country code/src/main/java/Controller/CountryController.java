package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.countryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @RequestMapping("/country")
    @ResponseBody
    public Country getCountryIndia(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("countryIndia", Country.class);
        return country;
    }

    @Autowired
    countryService service;

    @GetMapping("countries/{code}")
    @ResponseBody
    public Country getCountry(@PathVariable String code){
        return service.getCountry(code);
    }
}