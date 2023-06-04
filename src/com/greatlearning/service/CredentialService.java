package com.greatlearning.service;
import com.greatlearning.interfaces.ICredentials;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService implements ICredentials {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		Random random = new Random();
		String password = "";
		
		for(int i=0;i<8;i++) {
			password += values.charAt(random.nextInt(values.length()));
		}
		
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		
		String firstName = employee.getFirstName().toLowerCase();
		String lastName = employee.getLastName().toLowerCase();
		
		String generatedEmailAddress = firstName+lastName+"@"+department+".greatlearning.com";
		
		return generatedEmailAddress;
	}

	@Override
	public void showCredentials(Employee employee, String department) {
		// TODO Auto-generated method stub
		
		String emailAddress = this.generateEmailAddress(employee, department);
		String password = this.generatePassword();
		
		System.out.println("Dear "+employee.getFirstName()+", your generated credentials are as follows");
		System.out.println("Email --> "+emailAddress);
		System.out.println("Password --> "+password);
	}

}
