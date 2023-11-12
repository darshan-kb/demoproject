package com.demoproject.io.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String DepartmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        DepartmentName = departmentName;
    }

    public Department(String departmentName) {
        this.DepartmentName = departmentName;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
