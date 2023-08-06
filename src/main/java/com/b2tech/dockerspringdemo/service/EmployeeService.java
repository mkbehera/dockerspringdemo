package com.b2tech.dockerspringdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2tech.dockerspringdemo.model.Employee;
import com.b2tech.dockerspringdemo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return (List<Employee>)this.employeeRepository.findAll();
	}
	
	public Employee saveEmployeeDetails(Employee employee) {
		return employeeRepository.save(employee);
	}
}
