package com.demoproject.io.repository;

import com.demoproject.io.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
