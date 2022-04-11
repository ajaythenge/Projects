package com.examportal.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Subject{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectId;
	private String subjectName;
	private Integer noOfQuestions;

	
	@ManyToMany(mappedBy = "subjectList", cascade = CascadeType.ALL)
	private List<User> enrolledUser = new ArrayList<User>();
	
	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	List<Question> questionsList = new ArrayList<Question>();

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Integer subjectId, String subjectName, Integer noOfQuestions, List<User> enrolledUser,
			List<Question> questionsList) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.noOfQuestions = noOfQuestions;
		this.enrolledUser = enrolledUser;
		this.questionsList = questionsList;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(Integer noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public List<User> getEnrolledUser() {
		return enrolledUser;
	}

	public void setEnrolledUser(List<User> enrolledUser) {
		this.enrolledUser = enrolledUser;
	}

	public List<Question> getQuestionsList() {
		return questionsList;
	}

	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", noOfQuestions=" + noOfQuestions
				+ ", enrolledUser=" + enrolledUser + ", questionsList=" + questionsList + "]";
	}

	
	
}
