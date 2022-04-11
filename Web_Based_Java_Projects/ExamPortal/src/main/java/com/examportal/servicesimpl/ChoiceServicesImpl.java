package com.examportal.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.dao.ChoiceDao;
import com.examportal.entity.Choice;
import com.examportal.services.ChoiceServices;


@Service
public class ChoiceServicesImpl implements ChoiceServices {

	@Autowired
	ChoiceDao dao;
	
	@Override
	public Choice getSingleChoice(int id) {
		return dao.getById(id);
	}

	@Override
	public List<Choice> getAllChoice() {
		return dao.findAll();
	}

	@Override
	public Choice addChoice(Choice Choice) {
		return dao.save(Choice);
	}

	@Override
	public Choice updateChoice(Choice choice) {
		return dao.save(choice);
	}

	@Override
	public boolean deleteChoice(int id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
