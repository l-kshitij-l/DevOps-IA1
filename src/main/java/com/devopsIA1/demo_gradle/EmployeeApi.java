package com.devopsIA1.demo_gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    @GetMapping("/{empId}")
    public String getEmploye(String empId){
        return "Employee Found";
    }
}
