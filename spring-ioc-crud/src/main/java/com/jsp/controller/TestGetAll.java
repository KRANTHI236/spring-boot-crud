package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.Confi;

public class TestGetAll {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Confi.class);
	EmployeeService employeeService=(EmployeeService) applicationContext.getBean("employeeService");
	List<Employee> list=employeeService.getAllEMployeeService();
	for (Employee employee:list) {
		System.out.println("Employee Id:"+employee.getId());
		System.out.println("Employee Name:"+employee.getName());
		System.out.println("Employee Email:"+employee.getEmail());
		System.out.println("Employee Password:"+employee.getPassword());
		System.out.println("------------------------------------------------------------------------------------------");
	}
}
}
