package com.examportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.entity.LogIn;
import com.examportal.entity.User;
import com.examportal.services.UserServices;

@RestController
@CrossOrigin
public class UsersController {
	
	@Autowired
	UserServices services;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return services.addUser(user);
	}
	
	@GetMapping("/getuser/{id}")
	public User getUserById(@PathVariable int id) {
		return services.getSingleUser(id);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return services.updateUser(user);
	}
	
	@GetMapping("/getalluser")
	public List<User> getAllUser() {
		return services.getAllUser();
	}
	
	@GetMapping("/deleteuser/{id}")
	public boolean deleteUser(@PathVariable int id) {
		return services.deleteUser(id);
	}
	
	// User Sign In
	@PostMapping("/signin")
	public User signIn(@RequestBody LogIn login) {

		User temp = services.getUserByEmail(login.getEmail());

		try {
			if (temp == null) {
				return null;
			} else if (login.getEmail().equals(temp.getEmail()) && login.getPassword().equals(temp.getPassword())) {
				return temp;
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	// User Sign Up
	@PostMapping("/signup")
	public User signUp(@RequestBody User user) {
		return services.addUser(user);
	}
	
	
}
