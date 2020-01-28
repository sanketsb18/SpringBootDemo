package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/")
    public List<Employee> getEmployees(){
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"Sanket","Bhosale","howtodoinjava@gmail.com"));
        return employeesList;
    }

}
