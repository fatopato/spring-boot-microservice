package com.example.profilemanagement.service;

import com.example.profilemanagement.entity.EmployeeProfile;
import com.example.profilemanagement.repository.EmployeeProfileRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    @NonNull
    EmployeeProfileRepository repository;

    @Override
    public EmployeeProfile addEmployee(EmployeeProfile profile) {
        return repository.save(profile);
    }

    @Override
    public List<EmployeeProfile> getEmployees() {
        return repository.findAll();
    }
}
