package com.loanmanagement.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loanmanagement.server.entities.Employee;
import com.loanmanagement.server.repositories.EmployeeRepository;

import org.springframework.http.HttpStatus;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public ResponseEntity<Employee> addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}
	
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}