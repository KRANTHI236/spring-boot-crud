package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.Confi;

public class TestSave {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Confi.class);
	Employee employee=(Employee) applicationContext.getBean("employee");
	EmployeeService employeeService=(EmployeeService) applicationContext.getBean("employeeService");
	employee.setId(2);
	employee.setName("arun");
	employee.setEmail("arun@gmail.com");
	employee.setPassword("arun123");
	Employee employee2=employeeService.saveEmployeeService(employee);
	
	if(employee2!=null) {
		System.out.println("data saved");
	}
	else {
		System.out.println("pls check the data");
	}
}
}
