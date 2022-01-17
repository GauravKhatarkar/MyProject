package com.quiz.service;



import com.quiz.model.UserRequest;

public interface AuthService {
	public boolean auth(UserRequest userRequest);
}
