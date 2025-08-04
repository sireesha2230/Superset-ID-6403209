package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        return new Country("India", "IN");
    }
}
