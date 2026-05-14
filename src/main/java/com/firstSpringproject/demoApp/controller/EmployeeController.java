package com.firstSpringproject.demoApp.controller;

import com.firstSpringproject.demoApp.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping
    public String getEmployee(){
        return "Employee list is preparing...";
    }

    @PostMapping
    public Employee addEmployee(@RequestBody  Employee payload){

        return payload;
    }

}
