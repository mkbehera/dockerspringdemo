package com.b2tech.dockerspringdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.b2tech.dockerspringdemo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
