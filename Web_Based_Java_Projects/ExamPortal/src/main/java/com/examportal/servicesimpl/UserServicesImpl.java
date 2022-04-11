package com.examportal.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.dao.UserDao;
import com.examportal.entity.User;
import com.examportal.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
	UserDao dao;

	@Override
	public User getSingleUser(int id) {
		try {
			return dao.getById(id);			
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<User> getAllUser() {
		return dao.findAll();
	}

	@Override
	public User addUser(User user) {
		return dao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return dao.save(user);
	}

	@Override
	public boolean deleteUser(int id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public User getUserByEmail(String email) {
		return dao.getUserByEmail(email);
	}

}
