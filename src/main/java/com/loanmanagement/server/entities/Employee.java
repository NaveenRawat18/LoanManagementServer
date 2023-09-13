package com.loanmanagement.server.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee_master")
public class Employee {
	@Id
	private String employee_id;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String employee_name;
	private String designation;
	private String department;
	@Pattern(regexp="(M|F)")
	private String gender;
	private LocalDate date_of_birth;
	private LocalDate date_of_joining;
}
