package com.quiz.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizDAO;
import com.quiz.entity.Quiz;
import com.quiz.entity.User;
import com.quiz.model.QuizResponse;
import com.quiz.model.QuizResponses;
import com.quiz.model.UserRequest;
@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizDAO quizdao;
	
	/****
	 
	 List<Employee> employeeList=employeeDAO.getAllEmployees();
		List<EmployeeResponse> employeeResponseList=new ArrayList<EmployeeResponse>();
		for(Employee employee:employeeList) {
			EmployeeResponse employeeResponse=new EmployeeResponse();
			employeeResponse.setEmpId(employee.getEmpId());
			employeeResponse.setEmpName(employee.getEmpName());
			employeeResponse.setEmpSalary(employee.getEmpSalary());
			employeeResponse.setEmpDesignation(employee.getEmpDesignation());
			employeeResponseList.add(employeeResponse);
		}
		EmployeeResponses employeeResponses=new EmployeeResponses();
		employeeResponses.setEmployeeResponse(employeeResponseList);
		return employeeResponses;
	} 
	 * */

	@Override
	public QuizResponses quizesRetrievalServicesXML(String quizSubject) {
		List<Quiz> quizList = quizdao.getQuiz(quizSubject);
		List <QuizResponse> quizResponseList = new ArrayList<QuizResponse>();
		for(Quiz quiz:quizList) {
			QuizResponse quizResponse = new QuizResponse();
			quizResponse.setQID(quiz.getQID());
			quizResponse.setQuestions(quiz.getQuestions());
			quizResponse.setOption1(quiz.getOption1());
			quizResponse.setOption2(quiz.getOption2());
			quizResponse.setOption3(quiz.getOption3());
			quizResponse.setOption4(quiz.getOption4());
		}
		
		QuizResponses quizResponses = new QuizResponses();
		quizResponses.setQuizresponse(quizResponseList);
		return quizResponses;
	}

	@Override
	public List<QuizResponse> quizesRetrievalServicesJSON(String quizSubject) {
		List<Quiz> quizList = quizdao.getQuiz(quizSubject);
		List <QuizResponse> quizResponseList = new ArrayList<QuizResponse>();
		for(Quiz quiz:quizList) {
			QuizResponse quizResponse = new QuizResponse();
			quizResponse.setQID(quiz.getQID());
			quizResponse.setQuestions(quiz.getQuestions());
			quizResponse.setOption1(quiz.getOption1());
			quizResponse.setOption2(quiz.getOption2());
			quizResponse.setOption3(quiz.getOption3());
			quizResponse.setOption4(quiz.getOption4());
			quizResponse.setCorrectAnswer(quiz.getCorrectAnswer());
			quizResponseList.add(quizResponse);

	}
		return quizResponseList;
	}

	@Override
	public QuizResponse getQuiz(int QID) {
		Quiz quiz = quizdao.getQuizById(QID);
		QuizResponse quizResponse = new QuizResponse();
		quizResponse.setQID(quiz.getQID());
		quizResponse.setQuestions(quiz.getQuestions());
		quizResponse.setOption1(quiz.getOption1());
		quizResponse.setOption2(quiz.getOption2());
		quizResponse.setOption3(quiz.getOption3());
		quizResponse.setOption4(quiz.getOption4());
		return quizResponse;
	}

	@Override
	public boolean persistUser(UserRequest userRequest) {
	   User user = new User();
	   user.setFirstName(userRequest.getFirstName());
	   user.setLastName(userRequest.getLastName());
	   user.setUserName(userRequest.getUserName());
	   user.setEmailId(userRequest.getEmailId());
	   user.setPassword(userRequest.getPassword());
	   user.setAddress(userRequest.getAddress());
	   user.setCity(userRequest.getCity());
	   user.setCountry(userRequest.getCountry());
	   user.setGender(userRequest.getGender());
	   user.setDob(userRequest.getDob());
		return quizdao.persistQuiz(user);
	}

	
}
