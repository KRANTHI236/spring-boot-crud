 package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.Confi;

public class TestGetById {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Confi.class);
	Employee employee=(Employee) applicationContext.getBean("employee");
	employee.setId(3);
	EmployeeService employeeService=(EmployeeService) applicationContext.getBean("employeeService");
	Employee employee2=employeeService.getByIdEmployeeService(employee.getId());
	if(employee2!=null) {
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getEmail());
		System.out.println(employee2.getPassword());
	}
	else {
		 System.out.println("pls check the id");
	}
}
}
