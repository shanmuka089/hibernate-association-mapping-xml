package com.hibernate.enities;

import java.util.List;

public class Question {

	private int qsnId;

	private String qsn;

	private List<Answer> answers;

	
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Question(int qsnId, String qsn, List<Answer> answers, Answer answer) {
		super();
		this.qsnId = qsnId;
		this.qsn = qsn;
		this.answers = answers;
		this.answer = answer;
	}

	private Answer answer;

	public Question(int qsnId, String qsn, Answer answer) {
	super();
	this.qsnId = qsnId;
	this.qsn = qsn;
	this.answer = answer;
}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getQsnId() {
		return qsnId;
	}

	public void setQsnId(int qsnId) {
		this.qsnId = qsnId;
	}

	public String getQsn() {
		return qsn;
	}

	public void setQsn(String qsn) {
		this.qsn = qsn;
	}

	public Question() {
		super();
	}

}
