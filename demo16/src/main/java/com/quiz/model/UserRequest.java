package com.quiz.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserRequest {
	private String FirstName;
	private String LastName;
	private String UserName;
	private String EmailId;
	private String Password;
	private Date Dob;
	private String Country;
	private String City;
	private String Address;
	private String Gender;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "UserRequest [FirstName=" + FirstName + ", LastName=" + LastName + ", UserName=" + UserName
				+ ", EmailId=" + EmailId + ", Password=" + Password + ", Dob=" + Dob + ", Country=" + Country
				+ ", City=" + City + ", Address=" + Address + ", Gender=" + Gender + "]";
	}
	public UserRequest() {}

}
