package com.infinitium.spring_with_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Daniel Joi Partogi Hutapea
 */
@Controller
public class IndexController
{
    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSS");

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getHome(Model model)
    {
        model.addAttribute("serverTime", SDF.format(new Date()));
        return "index";
    }
}
