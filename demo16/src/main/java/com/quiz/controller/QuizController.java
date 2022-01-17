package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.QuizResponse;
import com.quiz.model.UserRequest;
import com.quiz.model.UserResponse;
import com.quiz.service.AuthService;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class QuizController {
	
	@Autowired
	private QuizService quizservice;
	@Autowired
	private AuthService authService;
	//@RequestMapping(value="employees",method = RequestMethod.GET)
	@GetMapping("quizdata/{quizSubject}")
	public ResponseEntity<List<QuizResponse>> handleGetAllEmployeesJSON(@PathVariable("quizSubject")String quizSubject){
		List<QuizResponse> quizResponseList=quizservice.quizesRetrievalServicesJSON(quizSubject);
		ResponseEntity<List<QuizResponse>> response=null;
		if(!quizResponseList.isEmpty()) {
		 response=new ResponseEntity<List<QuizResponse>>(quizResponseList,HttpStatus.OK);
		}else {
			response=new ResponseEntity<List<QuizResponse>>(quizResponseList,HttpStatus.EXPECTATION_FAILED);
		}
		return response;
	}
	
	@PostMapping("users")
	public ResponseEntity<UserResponse> persistUser(@RequestBody UserRequest userRequest){
		boolean result=quizservice.persistUser(userRequest);
		ResponseEntity<UserResponse> response=null;
		if(result) {
			UserResponse userResponse = new UserResponse();
			userResponse.setFirstName(userRequest.getFirstName());
			userResponse.setLastName(userRequest.getLastName());
			userResponse.setUserName(userRequest.getUserName());
			userResponse.setPassword(userRequest.getPassword());
			userResponse.setDob(userRequest.getDob());
			userResponse.setCountry(userRequest.getCountry());
			userResponse.setCity(userRequest.getCity());
			userResponse.setGender(userRequest.getGender());
            userResponse.setEmailId(userRequest.getEmailId());
            userResponse.setAddress(userRequest.getAddress());
			response=new ResponseEntity<UserResponse>(userResponse,HttpStatus.CREATED);
		}else {
			response=new ResponseEntity<UserResponse>(HttpStatus.CONFLICT);

		}
		return response;
		
	}
	
	@PostMapping("login")
	public Boolean authUser(@RequestBody UserRequest userRequest){
		
		boolean isAuthentication = authService.auth(userRequest);
		
		
		if(isAuthentication)
			return true;
		else
			return false;
	}
}
