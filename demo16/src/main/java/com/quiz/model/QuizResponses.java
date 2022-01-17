package com.quiz.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class QuizResponses {
	
	public List<QuizResponse> quizresponse;

	public List<QuizResponse> getQuizresponse() {
		return quizresponse;
	}

	public void setQuizresponse(List<QuizResponse> quizresponse) {
		this.quizresponse = quizresponse;
	}

	

}
