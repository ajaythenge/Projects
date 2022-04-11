package com.examportal.services;

import java.util.List;

import com.examportal.entity.User;

public interface UserServices {
	
	public User getSingleUser(int id);
	
	public List<User> getAllUser();
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public boolean deleteUser(int id);
	
	public User getUserByEmail(String email);
	
}
