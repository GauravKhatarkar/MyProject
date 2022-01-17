package com.quiz.helper;

public class QuizDBQuery {
	private String insertDataQuery;
	private String selectQuizByIdQuery;
	
	private String selectDataQuerycssquestions;
	private String selectDataQueryjavaquestions;
	
	private String selectDataQuerypythonquestions;
	private String selectDataQuerydatabasequestions;
	
	private String selectUserByUserName;
	
	
	public QuizDBQuery() {}
	
	
	public String getInsertDataQuery() {
		return insertDataQuery;
	}
	public void setInsertDataQuery(String insertDataQuery) {
		this.insertDataQuery = insertDataQuery;
	}
	public String getSelectQuizByIdQuery() {
		return selectQuizByIdQuery;
	}
	public void setSelectQuizByIdQuery(String selectQuizByIdQuery) {
		this.selectQuizByIdQuery = selectQuizByIdQuery;
	}


	public String getSelectDataQuerycssquestions() {
		return selectDataQuerycssquestions;
	}


	public void setSelectDataQuerycssquestions(String selectDataQuerycssquestions) {
		this.selectDataQuerycssquestions = selectDataQuerycssquestions;
	}


	public String getSelectDataQueryjavaquestions() {
		return selectDataQueryjavaquestions;
	}


	public void setSelectDataQueryjavaquestions(String selectDataQueryjavaquestions) {
		this.selectDataQueryjavaquestions = selectDataQueryjavaquestions;
	}


	public String getSelectDataQuerypythonquestions() {
		return selectDataQuerypythonquestions;
	}


	public void setSelectDataQuerypythonquestions(String selectDataQuerypythonquestions) {
		this.selectDataQuerypythonquestions = selectDataQuerypythonquestions;
	}


	public String getSelectDataQuerydatabasequestions() {
		return selectDataQuerydatabasequestions;
	}


	public void setSelectDataQuerydatabasequestions(String selectDataQuerydbquestions) {
		this.selectDataQuerydatabasequestions = selectDataQuerydbquestions;
	}


	public String getSelectUserByUserName() {
		return selectUserByUserName;
	}


	public void setSelectUserByUserName(String selectUserByUserName) {
		this.selectUserByUserName = selectUserByUserName;
	}


}
