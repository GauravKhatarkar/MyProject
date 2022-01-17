package com.quiz.entity;

public class Quiz {
	private int QID;
	private String Questions;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String CorrectAnswer;
	
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
		return "Quiz [QID=" + QID + ", Questions=" + Questions + ", Option1=" + Option1 + ", Option2=" + Option2
				+ ", Option3=" + Option3 + ", Option4=" + Option4 + ", CorrectAnswer=" + CorrectAnswer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CorrectAnswer == null) ? 0 : CorrectAnswer.hashCode());
		result = prime * result + ((Option1 == null) ? 0 : Option1.hashCode());
		result = prime * result + ((Option2 == null) ? 0 : Option2.hashCode());
		result = prime * result + ((Option3 == null) ? 0 : Option3.hashCode());
		result = prime * result + ((Option4 == null) ? 0 : Option4.hashCode());
		result = prime * result + QID;
		result = prime * result + ((Questions == null) ? 0 : Questions.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quiz other = (Quiz) obj;
		if (CorrectAnswer == null) {
			if (other.CorrectAnswer != null)
				return false;
		} else if (!CorrectAnswer.equals(other.CorrectAnswer))
			return false;
		if (Option1 == null) {
			if (other.Option1 != null)
				return false;
		} else if (!Option1.equals(other.Option1))
			return false;
		if (Option2 == null) {
			if (other.Option2 != null)
				return false;
		} else if (!Option2.equals(other.Option2))
			return false;
		if (Option3 == null) {
			if (other.Option3 != null)
				return false;
		} else if (!Option3.equals(other.Option3))
			return false;
		if (Option4 == null) {
			if (other.Option4 != null)
				return false;
		} else if (!Option4.equals(other.Option4))
			return false;
		if (QID != other.QID)
			return false;
		if (Questions == null) {
			if (other.Questions != null)
				return false;
		} else if (!Questions.equals(other.Questions))
			return false;
		return true;
	}
	public Quiz() {}
	public String getCorrectAnswer() {
		return CorrectAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		CorrectAnswer = correctAnswer;
	}

}
