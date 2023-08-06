package com.b2tech.dockerspringdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b2tech.dockerspringdemo.model.Employee;
import com.b2tech.dockerspringdemo.service.EmployeeService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/addEmployee")
	public Employee saveEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.saveEmployeeDetails(employee);
	}
}
