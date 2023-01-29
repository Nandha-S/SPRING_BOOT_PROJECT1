package com.springbootorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootorm.entity.Company;
import com.springbootorm.entity.Employee;
import com.springbootorm.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeMngtApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMngtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		emp1.setEmpId(01);
		emp1.setEmpName("NandhaKumar S");
		emp1.setEmpAge(22);
		emp1.setEmpEmail("nandhakumar.somu@gmail.com");
		emp1.setEmpMobile("9360992559");
		
		Employee emp2=new Employee();
		emp2.setEmpId(02);
		emp2.setEmpName("Sathish");
		emp2.setEmpAge(22);
		emp2.setEmpEmail("Sathish@gmail.com");
		emp2.setEmpMobile("1234567890");
		
		Employee emp3=new Employee();
		emp3.setEmpId(03);
		emp3.setEmpName("Indhu");
		emp3.setEmpAge(29);
		emp3.setEmpEmail("indhu@gmail.com");
		emp3.setEmpMobile("3442776490");
		
		Company comp1=new Company();
		comp1.setCId(55);
		comp1.setCName("TCS");
		comp1.setCLocation("Delhi");
		comp1.setCPincode(55980);
		
		Company comp2=new Company();
		comp2.setCId(59);
		comp2.setCName("Accenture");
		comp2.setCLocation("Chennai");
		comp2.setCPincode(8756576);
		
		Company comp3=new Company();
		comp3.setCId(89);
		comp3.setCName("Wipro");
		comp3.setCLocation("Chennai");
		comp3.setCPincode(87685);
		
		emp1.setCompany(comp2);
		emp2.setCompany(comp3);
		emp3.setCompany(comp1);
		
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
		
		System.out.println("Data Saved");
	}

}
