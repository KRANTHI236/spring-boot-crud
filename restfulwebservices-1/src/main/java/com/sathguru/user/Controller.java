package com.sathguru.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	public UserDao dao;

	@GetMapping("/users")
	public List<User> getAllUser() {

		return dao.saveUser();

	}

	@GetMapping("/users/{id}")
	public User getById(@PathVariable int id) {

		return dao.getById(id);

	}

	@PostMapping("insert")
	public void insertNewUser(@RequestBody User user) {

		User saveUser = dao.insertUser(user);
	}

}
