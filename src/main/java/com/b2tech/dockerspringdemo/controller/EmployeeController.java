package com.b2tech.dockerspringdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b2tech.dockerspringdemo.model.Employee;
import com.b2tech.dockerspringdemo.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeRepository employeeRepositoty;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return (List<Employee>)employeeRepositoty.findAll();
	}
	
	@PostMapping
	public Employee saveEmployeeDetails(@RequestBody Employee employee) {
		return employeeRepositoty.save(employee);
	}
}
