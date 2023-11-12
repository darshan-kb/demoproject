package com.demoproject.io.service;

import com.demoproject.io.entities.Department;
import com.demoproject.io.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department addDepartment(String departmentName) {
        return departmentRepository.save(new Department(departmentName));
    }
}
