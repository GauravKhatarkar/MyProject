package com.quiz.service;

import java.util.List;
import com.quiz.model.QuizResponse;
import com.quiz.model.QuizResponses;
import com.quiz.model.UserRequest;


public interface QuizService {
	
	public QuizResponses quizesRetrievalServicesXML(String quizSubject);
	public List<QuizResponse> quizesRetrievalServicesJSON(String quizSubject);
	public QuizResponse getQuiz(int QID);
	public boolean persistUser(UserRequest userRequest);


}
