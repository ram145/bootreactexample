package com.spring.bootreactexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bootreactexample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
