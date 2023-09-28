package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;
@Component
public class EmployeeService {
@Autowired
EmployeeDao dao;
public Employee saveEmployeeService(Employee employee) {
	return dao.saveEmployee(employee);
}
public Employee updateEmployeeService(Employee employee) {
	return dao.updateEmployee(employee);
}
public Employee deleteEmployeeService(int id) {
	return dao.deleteEmployee(id);
}
public Employee getByIdEmployeeService(int id) {
	return dao.getByIdEmployee(id);
}
public List<Employee> getAllEMployeeService() {
	return dao.getAllEmlpoyee();
}
}
