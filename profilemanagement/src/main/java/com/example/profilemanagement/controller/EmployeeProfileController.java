package com.example.profilemanagement.controller;

import com.example.profilemanagement.entity.EmployeeProfile;
import com.example.profilemanagement.service.EmployeeProfileService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/employeeProfile")
public class EmployeeProfileController {

    @NonNull EmployeeProfileService employeeProfileService;

    @PostMapping(value = "/")
    public EmployeeProfile save(@RequestBody EmployeeProfile employeeProfile){
        return employeeProfileService.addEmployee(employeeProfile);
    }

    @GetMapping(value = "/")
    public List<EmployeeProfile> getAll(){
        return employeeProfileService.getEmployees();
    }
}
