package com.spring.bootreactexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bootreactexample.model.Employee;
import com.spring.bootreactexample.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeerepository; 
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeerepository.findAll();
	}
	
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeerepository.save(emp);
		
	}
}
