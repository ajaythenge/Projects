package com.examportal.services;

import java.util.List;

import com.examportal.entity.Choice;

public interface ChoiceServices {

	public Choice getSingleChoice(int id);
	
	public List<Choice> getAllChoice();
	
	public Choice addChoice(Choice Choice);
	
	public Choice updateChoice(Choice Choice);
	
	public boolean deleteChoice(int id);
}
