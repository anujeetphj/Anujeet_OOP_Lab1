package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayMenu();
		
		Scanner scan1 = new Scanner(System.in);
		int choice = scan1.nextInt();
		
		Employee employee1 = new Employee("Anujeet", "Kaur");
		
		String[] departmentMappings = {"tech", "admin", "hr", "legal"};
		String selectedDepartment = departmentMappings[choice-1];
		
		ICredentials credentialGenerator = new CredentialService();
		
		credentialGenerator.showCredentials(employee1, selectedDepartment);
		
	}
	
	public static void displayMenu()
	{
		System.out.println("Please enter the department from the following");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}

}
