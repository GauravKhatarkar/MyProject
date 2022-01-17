package com.quiz.dao;

import java.util.List;

import com.quiz.entity.Quiz;
import com.quiz.entity.User;

public interface QuizDAO {

	public List<Quiz> getQuiz(String quizSubject);
	public Quiz getQuizById(int QID);
	public boolean persistQuiz(User user);
	public User authUser(String userName);

}
