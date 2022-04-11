package com.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examportal.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	@Query("select u from User u where u.email = :email")
	public User getUserByEmail(String email);
	
}
