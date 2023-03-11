package com.product.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentDTO {
	
	@JsonIgnore
	private int id;
	
	
	private String firstName;
	
	@JsonIgnore
	private String lastName;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	private String email;
	
}
