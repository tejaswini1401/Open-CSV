package com.opencsv.OpenCsvReader;
public class MyUser {
	private String firstName;
	private String email;
	private int mobileNumber;
	private String country;
	
	public MyUser(String firstName, String email, int mobileNumber, String country) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
}