package com.examportal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Choice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer choiceId;
	private String choice;
	private Boolean answer;

	@OneToOne
	@JoinColumn(name = "questionId")
	private Question question;

	public Choice() {
	}

	public Choice(Integer choiceId, String choice, Boolean answer, Question question) {
		super();
		this.choiceId = choiceId;
		this.choice = choice;
		this.answer = answer;
		this.question = question;
	}

	public Integer getChoiceId() {
		return choiceId;
	}

	public void setChoiceId(Integer choiceId) {
		this.choiceId = choiceId;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public Boolean getAnswer() {
		return answer;
	}

	public void setAnswer(Boolean answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Choice [choiceId=" + choiceId + ", choice=" + choice + ", answer=" + answer + ", question=" + question
				+ "]";
	}

}
