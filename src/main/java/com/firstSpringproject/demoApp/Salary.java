package com.firstSpringproject.demoApp;

import org.springframework.stereotype.Component;

@Component
public class Salary {
    private int basicPay = 5000;
    private int hra = 500;
    private int bonus = 10;
    private int pf = 1800;

    public double netSalaryCalculation(){
        return basicPay + hra + (basicPay * 10 /100) - pf;
    }

}
