package com.infinitium.spring_with_thymeleaf.controller;

import com.infinitium.spring_with_thymeleaf.db.EmployeeDao;
import com.infinitium.spring_with_thymeleaf.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(path = "/edit-employee", method = RequestMethod.GET)
    public String edit(Model model, @RequestParam("id") int id)
    {
        System.out.println("Param ID = "+id);
        Employee employee = EmployeeDao.findEmployeeById(id);
        model.addAttribute("employee", employee);
        return "edit-employee";
    }
}
