package com.sathguru.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Component
public class UserDao {

	public static int count = 2;
	private static List<User> users = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
//	@GetMapping("userss")

	public List<User> saveUser() {

		User user = new User(1, "kiran", 20);
//		user.setId(1);
//		user.setName("kiran");
//		user.setAge(20);

		User user2 = new User(2, "jai", 30);
//		user2.setId(2);
//		user2.setName("jai");
//		user2.setAge(29);

		users.add(user);
		users.add(user2);

		return users;

	}

	public User getById(int id) {

		for (User user2 : users) {
			if (user2.getId() == id) {
				return user2;

			}
		}
		return null;
	}

	public User insertUser(User user) {

		if (user.getId() == null) {
			user.setId(++count);
		}
		users.add(user);
//		return user;	

//			System.out.println("enter the id");
//			int id = scanner.nextInt();
//			System.out.println("enter the name");
//			String name = scanner.next();
//			System.out.println("enter the age");
//			int age = scanner.nextInt();
//
//			Object[] obj = { id, name, age };
//
//			users.add(user);

//			UserDao dao = new UserDao();
//			dao.saveUser();

//		return user;
		return user;
	}

}