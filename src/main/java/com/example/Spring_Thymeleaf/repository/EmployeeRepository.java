package com.example.Spring_Thymeleaf.repository;

import com.example.Spring_Thymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

