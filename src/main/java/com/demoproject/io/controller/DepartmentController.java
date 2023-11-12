package com.demoproject.io.controller;

import com.demoproject.io.entities.Department;
import com.demoproject.io.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;


    @PostMapping("/department")
    public Department addDepartment(@RequestBody String departmentName){
        //System.out.println(departmentName);
        return departmentService.addDepartment(departmentName);
    }
}
