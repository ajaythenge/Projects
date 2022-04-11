package com.examportal.services;

import java.util.List;
import com.examportal.entity.Question;

public interface QuestionServices {
	
	public Question getSingleQuestion(int id);
	
	public List<Question> getAllQuestion();
	
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public boolean deleteQuestion(int id);
	
}
