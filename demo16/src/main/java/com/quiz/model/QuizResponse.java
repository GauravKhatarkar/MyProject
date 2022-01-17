package com.quiz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QuizResponse {
	private int QID;
	private String Questions;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String CorrectAnswer;
	
	
	public QuizResponse() {}
	public int getQID() {
		return QID;
	}
	public void setQID(int qID) {
		QID = qID;
	}
	public String getQuestions() {
		return Questions;
	}
	public void setQuestions(String questions) {
		Questions = questions;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	@Override
	public String toString() {
		return "QuizResponse [QID=" + QID + ", Questions=" + Questions + ", Option1=" + Option1 + ", Option2=" + Option2
				+ ", Option3=" + Option3 + ", Option4=" + Option4 + ", CorrectAnswer=" + CorrectAnswer + "]";
	}
	public String getCorrectAnswer() {
		return CorrectAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		CorrectAnswer = correctAnswer;
	}
}
