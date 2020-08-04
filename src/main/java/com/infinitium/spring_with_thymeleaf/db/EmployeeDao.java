package com.infinitium.spring_with_thymeleaf.db;

import com.infinitium.spring_with_thymeleaf.dto.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class EmployeeDao
{
    private static final Map<Integer, Employee> MAP_OF_EMPLOYEE = new HashMap<>();

    static
    {
        MAP_OF_EMPLOYEE.put(1, new Employee(1, "Daniel", "Software Developer", "Jakarta", 1_000));
        MAP_OF_EMPLOYEE.put(2, new Employee(2, "Joi", "Business Analyst", "Bandung", 2_000));
        MAP_OF_EMPLOYEE.put(3, new Employee(3, "Partogi", "Product Manager", "Jogja", 3_000));
    }

    public static List<Employee> getAllEmployees()
    {
        return MAP_OF_EMPLOYEE.values().stream().collect(Collectors.toList());
    }

    public static Employee findEmployeeById(int id)
    {
        return MAP_OF_EMPLOYEE.get(id);
    }
}
