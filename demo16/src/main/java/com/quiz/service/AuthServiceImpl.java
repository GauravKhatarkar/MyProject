package com.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizDAO;
import com.quiz.entity.User;
import com.quiz.model.UserRequest;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private QuizDAO authUserDAO;

	

	@Override
	public boolean auth(UserRequest userRequest) {
		
		User user = authUserDAO.authUser(userRequest.getUserName());
	    
	   
	    
	    if(userRequest.getUserName().equals(user.getUserName()) && userRequest.getPassword().equals(user.getPassword())) {
	    	return true;
	    }
		return false;
	}


}
