package com.examportal.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.dao.QuestionsDao;
import com.examportal.entity.Question;
import com.examportal.services.QuestionServices;

@Service
public class QuestionServicesImpl implements QuestionServices {

	@Autowired
	QuestionsDao dao;
	
	@Override
	public Question getSingleQuestion(int id) {
		return dao.getById(id);
	}

	@Override
	public List<Question> getAllQuestion() {
		return dao.findAll();
	}

	@Override
	public Question addQuestion(Question question) {
		return dao.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		return dao.save(question);
	}

	@Override
	public boolean deleteQuestion(int id) {
		try {
			dao.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
