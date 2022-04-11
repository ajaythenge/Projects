package com.examportal.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.dao.SubjectDao;
import com.examportal.entity.Subject;
import com.examportal.services.SubjectServices;

@Service
public class SubjectServicesImpl implements SubjectServices{
	
	@Autowired
	SubjectDao dao;

	@Override
	public Subject getSingleSubject(int id) {
		return dao.getById(id);
	}

	@Override
	public List<Subject> getAllSubject() {
		return dao.findAll();
	}

	@Override
	public Subject addSubject(Subject subject) {
		return dao.save(subject);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		return dao.save(subject);
	}

	@Override
	public boolean deleteSubject(int id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
}
