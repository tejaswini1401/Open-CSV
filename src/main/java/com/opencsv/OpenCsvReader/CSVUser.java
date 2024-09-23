package com.opencsv.OpenCsvReader;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
	
	@CsvBindByName(column = "firstName")
	private String firstName;
	
	@CsvBindByName (column = "Email")
	private String Email;
	
	@CsvBindByName (column = "mobileNumber")
	private String PhoneNo;
	
	@CsvBindByName (column = "Country")
	private String Country;

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		firstName = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "CSVUser [Name=" + firstName + ", Email=" + Email + ", PhoneNo=" + PhoneNo + ", Country=" + Country + "]";
	}
	
	
	
}
