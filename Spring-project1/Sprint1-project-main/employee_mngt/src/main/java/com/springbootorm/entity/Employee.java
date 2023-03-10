package com.springbootorm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "empyname", length = 20)
	private String empName;
	@Column(name = "empyage")
	private int empAge;
	@Column(name = "empyemail",length = 30, unique = true)
	@NotNull(message="must include email in postman API")
	@NotBlank(message="must type value in email")
	@Email(message="please provide proper email id")
	private String empEmail;
	@Column(name = "empymobile",length=10)
	private String empMobile;

	@OneToOne(cascade = CascadeType.ALL)
	private Company company;
}
