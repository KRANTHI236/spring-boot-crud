package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.Confi;

public class TestUpdate {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Confi.class);
	Employee employee=(Employee) applicationContext.getBean("employee");
	employee.setId(1);
	employee.setName("manikanta");
	employee.setEmail("manikantapatnala@gmail.com");
	employee.setPassword("mani@123");
	EmployeeService employeeService=(EmployeeService) applicationContext.getBean("employeeService");
	Employee employee2=employeeService.updateEmployeeService(employee);
	if(employee2!=null) {
		System.out.println("data updated");
	}
	else {
		System.out.println("pls check the data");
	}
}
}
