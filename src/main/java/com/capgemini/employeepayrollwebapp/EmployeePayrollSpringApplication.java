package com.capgemini.employeepayrollwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.capgemini.employeepayrollwebapp"})
public class EmployeePayrollSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollSpringApplication.class, args);
    }
}
