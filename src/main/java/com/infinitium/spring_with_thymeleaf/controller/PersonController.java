package com.infinitium.spring_with_thymeleaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Joi Partogi Hutapea
 */
@RestController
@RequestMapping("/person")
public class PersonController
{
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello()
    {
        return "Hello";
    }
}
