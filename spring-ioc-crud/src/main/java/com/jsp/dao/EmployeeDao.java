package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Employee;

@Component
public class EmployeeDao {
@Autowired
EntityManagerFactory entityManagerFactory;
public Employee saveEmployee(Employee employee) {
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Employee employee2=entityManager.find(Employee.class, employee.getId());
	if(employee2!=null) {
		return null;
	}
	else {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
	
}
public Employee updateEmployee(Employee employee ) {
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Employee employee2=entityManager.find(Employee.class, employee.getId());
	if(employee2!=null) {
		entityTransaction.begin();
		entityManager.merge(employee2);
		employee2.setName(employee.getName());
		employee2.setEmail(employee.getName()); 
		employee2.setPassword(employee.getPassword());
		entityTransaction.commit();
	}
	return employee2;
	
}
public Employee deleteEmployee(int id) {
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Employee employee=entityManager.find(Employee.class, id);
	if(employee!=null) {
		entityTransaction.begin();
		entityManager.remove(employee);
        entityTransaction.commit();		
	}
	return employee;
	
}
public Employee getByIdEmployee(int id) {
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Employee employee=entityManager.find(Employee.class, id);
	return employee;
}
public List<Employee> getAllEmlpoyee(){
	List<Employee> list=new ArrayList<Employee>();
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("select u from Employee u");
	list=query.getResultList();
	return list;
}
}
