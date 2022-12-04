package com.gl.emailapp.service;

import com.gl.emailapp.model.Employee;

public interface CredentialService {
	
	public String passwordGenerator();
	
	public String emailGenerator(Employee employee, String department);
	
	public void displayCredentials(Employee emp, String department);
	
	
	
	

}
