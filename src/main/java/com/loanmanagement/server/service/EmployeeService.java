package com.loanmanagement.server.service;

import org.springframework.http.ResponseEntity;

import com.loanmanagement.server.entities.Employee;

public interface EmployeeService {
	ResponseEntity<Employee> addEmployee(Employee employee);
}
