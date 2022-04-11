package com.examportal.services;

import java.util.List;

import com.examportal.entity.Subject;

public interface SubjectServices {
	
	public Subject getSingleSubject(int id);
	
	public List<Subject> getAllSubject();
	
	public Subject addSubject(Subject subject);
	
	public Subject updateSubject(Subject subject);
	
	public boolean deleteSubject(int id);
	
}
