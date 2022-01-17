package com.quiz.entity;

import java.sql.Date;

public class User {
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
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Address == null) ? 0 : Address.hashCode());
	result = prime * result + ((City == null) ? 0 : City.hashCode());
	result = prime * result + ((Country == null) ? 0 : Country.hashCode());
	result = prime * result + ((Dob == null) ? 0 : Dob.hashCode());
	result = prime * result + ((EmailId == null) ? 0 : EmailId.hashCode());
	result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
	result = prime * result + ((Gender == null) ? 0 : Gender.hashCode());
	result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
	result = prime * result + ((Password == null) ? 0 : Password.hashCode());
	result = prime * result + ((UserName == null) ? 0 : UserName.hashCode());
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
	User other = (User) obj;
	if (Address == null) {
		if (other.Address != null)
			return false;
	} else if (!Address.equals(other.Address))
		return false;
	if (City == null) {
		if (other.City != null)
			return false;
	} else if (!City.equals(other.City))
		return false;
	if (Country == null) {
		if (other.Country != null)
			return false;
	} else if (!Country.equals(other.Country))
		return false;
	if (Dob == null) {
		if (other.Dob != null)
			return false;
	} else if (!Dob.equals(other.Dob))
		return false;
	if (EmailId == null) {
		if (other.EmailId != null)
			return false;
	} else if (!EmailId.equals(other.EmailId))
		return false;
	if (FirstName == null) {
		if (other.FirstName != null)
			return false;
	} else if (!FirstName.equals(other.FirstName))
		return false;
	if (Gender == null) {
		if (other.Gender != null)
			return false;
	} else if (!Gender.equals(other.Gender))
		return false;
	if (LastName == null) {
		if (other.LastName != null)
			return false;
	} else if (!LastName.equals(other.LastName))
		return false;
	if (Password == null) {
		if (other.Password != null)
			return false;
	} else if (!Password.equals(other.Password))
		return false;
	if (UserName == null) {
		if (other.UserName != null)
			return false;
	} else if (!UserName.equals(other.UserName))
		return false;
	return true;
}
@Override
public String toString() {
	return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", UserName=" + UserName + ", EmailId=" + EmailId
			+ ", Password=" + Password + ", Dob=" + Dob + ", Country=" + Country + ", City=" + City + ", Address="
			+ Address + ", Gender=" + Gender + "]";
}
public User() {}

}
