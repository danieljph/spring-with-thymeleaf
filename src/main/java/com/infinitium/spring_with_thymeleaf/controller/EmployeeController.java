package com.infinitium.spring_with_thymeleaf.controller;

import com.infinitium.spring_with_thymeleaf.db.EmployeeDao;
import com.infinitium.spring_with_thymeleaf.dto.Employee;
import com.infinitium.spring_with_thymeleaf.dto.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Daniel Joi Partogi Hutapea
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Page<List<Employee>> getAll()
    {
        List<Employee> listOfEmployee = EmployeeDao.getAllEmployees();

        Page<List<Employee>> page = new Page<>();
        page.setTotal(listOfEmployee.size());
        page.setLimit(10);
        page.setData(listOfEmployee);
        return page;
    }
}
