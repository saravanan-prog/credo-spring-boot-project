package com.firstSpringproject.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int empID = 1;
    private String empName = "Saravanan";

    @Autowired
    private Salary salary;

    public double getSalary(){
        return salary.netSalaryCalculation();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                '}';
    }
}
