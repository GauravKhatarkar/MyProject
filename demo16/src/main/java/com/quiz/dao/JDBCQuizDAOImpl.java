package com.quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quiz.entity.Quiz;
import com.quiz.entity.User;
import com.quiz.helper.QuizDBQuery;
import com.quiz.integrate.ConnectionManager;


@Repository("JDBCQuizDAOImpl")
public class JDBCQuizDAOImpl implements QuizDAO {
	
	@Autowired
	private ConnectionManager connectionManager;
	@Autowired
	private QuizDBQuery quizdbquery;
	

	@Override
	public List<Quiz> getQuiz(String quizSubject) {
		Connection connection=connectionManager.openConnection();
		List<Quiz> quizList=new ArrayList<Quiz>();
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet = null;
			
			if(quizSubject.equals("cssquestions")) {
				resultSet=statement.executeQuery(quizdbquery.getSelectDataQuerycssquestions());
			}
			
			if(quizSubject.equals("javaquestions")) {
				resultSet=statement.executeQuery(quizdbquery.getSelectDataQueryjavaquestions());
			}
			
			if(quizSubject.equals("databasequestions")) {
				resultSet=statement.executeQuery(quizdbquery.getSelectDataQuerydatabasequestions());
			}
			
			if(quizSubject.equals("pythonquestions")) {
				resultSet=statement.executeQuery(quizdbquery.getSelectDataQuerypythonquestions());
			}
			
			
			while(resultSet.next()) {
				Quiz q=new Quiz();
				q.setQID(resultSet.getInt(1));
				q.setQuestions(resultSet.getString(2));
				q.setOption1(resultSet.getString(3));
				q.setOption2(resultSet.getString(4));
				q.setOption3(resultSet.getString(5));
				q.setOption4(resultSet.getString(6));
				q.setCorrectAnswer(resultSet.getString(7));
				quizList.add(q);
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quizList;
		
	}

	@Override
	public Quiz getQuizById(int QID) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean persistQuiz(User user) {
		Connection connection=connectionManager.openConnection();
		int rows=0;
		try {
			PreparedStatement statement=connection.prepareStatement(quizdbquery.getInsertDataQuery());
			statement.setString(1,user.getFirstName());
			statement.setString(2, user.getLastName());
			statement.setString(3,user.getUserName());
			statement.setString(4,user.getEmailId());
			statement.setString(5,user.getPassword());
			statement.setDate(6,user.getDob());
			statement.setString(7,user.getCountry());
			statement.setString(8,user.getCity());
			statement.setString(9, user.getAddress());
			statement.setString(10,user.getGender());
			
			rows=statement.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		connectionManager.closeConnection();
		if(rows>0)
		return true;
		else
		return false;
	}

	@Override
	public User authUser(String userName) {
		
		Connection connection=connectionManager.openConnection();
		User user = new User();
		
		
		try {
			PreparedStatement statement=connection.prepareStatement(quizdbquery.getSelectUserByUserName());
			statement.setString(1, userName);		
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				
				user.setUserName(resultSet.getString(1));
				user.setPassword(resultSet.getString(2));
		    }
			
		} catch (SQLException ex) {
			System.err.println("yha pr exception h");
		}
		connectionManager.closeConnection();
		return user;
		
	}


}
