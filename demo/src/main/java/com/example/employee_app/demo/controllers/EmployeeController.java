package com.example.employee_app.demo.controllers;

import com.example.employee_app.demo.models.Employee;
import com.example.employee_app.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

   @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
       return employeeRepository.findAll();
   }





}
