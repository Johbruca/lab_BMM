package com.example.employee_app.demo;

import com.example.employee_app.demo.models.Employee;
import com.example.employee_app.demo.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee spartacus = new Employee("Spartacus", 32, 12345, "sparta4lyfe@gmail.com");
		employeeRepository.save(spartacus);
	}




}
