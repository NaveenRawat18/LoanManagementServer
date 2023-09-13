package com.loanmanagement.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loanmanagement.server.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String >{
	

}
