package com.examportal.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer questionId;
	private String question;
	private Integer marks;
	private String difficultyLevel;
	
	@OneToOne
	@JoinColumn(name = "subjectId")
	private Subject subject;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private List<Choice> choices = new ArrayList<Choice>();
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Integer questionId, String question, Integer marks, String difficultyLevel, Subject subject,
			List<Choice> choices) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.marks = marks;
		this.difficultyLevel = difficultyLevel;
		this.subject = subject;
		this.choices = choices;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", marks=" + marks
				+ ", difficultyLevel=" + difficultyLevel + ", subject=" + subject + ", choices=" + choices + "]";
	}

	
	
	
}
