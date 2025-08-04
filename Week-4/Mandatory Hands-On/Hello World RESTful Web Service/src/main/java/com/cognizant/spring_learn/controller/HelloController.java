package com.cognizant.spring_learn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        LOGGER.info("Greeting Start");
        LOGGER.info("Greeting End");
        return "Hello World!!";

    }
}