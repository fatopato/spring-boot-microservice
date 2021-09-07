package com.example.profilemanagement.service;

import com.example.profilemanagement.entity.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
    EmployeeProfile addEmployee(EmployeeProfile profile);
    List<EmployeeProfile> getEmployees();
}
