package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		// Read and validate 
		// name, more than 3 letters
		// Age, between 0 and 150
		// Salary, bigger than 0
		// Gender, f or m
		// status, s, m, w, d
		
		String name = new String(), gender = new String(), status = new String();
		int age = -1, salary = -1;
		Scanner scan = new Scanner(System.in);
		boolean proceed = true, nameOk = false, ageOk = false, salaryOk = false, genderOk = false, statusOk = false;
		
		while(proceed) {
			
			if (!nameOk) {
				System.out.print("Insert the name: ");
				name = scan.next();
			}
			
			if (!ageOk) {
				System.out.print("Insert the age: ");
				age = scan.nextInt();
			}
			
			if (!salaryOk) {
				System.out.print("Insert the salary: ");
				salary = scan.nextInt();
			}
			
			if (!genderOk) {
				System.out.print("Insert the gender (f/m): ");
				gender = scan.next();
			}
			
			if (!statusOk) {
				System.out.print("Marital status (s-single, m-married, w-widow/er, d-divorced): ");
				status = scan.next();
			}
			
			if (name.length() < 4) {
				System.out.print("\nName must have more than 3 letters.\n");
			} else {
				nameOk = true;
			}
			
			if (age < 0 || age > 150) {
				System.out.print("\nAge must be from 0 to 150.\n");
			} else {
				ageOk = true;
			}
			
			if (salary < 0) {
				System.out.print("\nSalary must be greater than 0.\n");
			} else {
				salaryOk = true;
			}
			
			if (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
				System.out.print("\nGender should be f or m.\n");
			} else {
				genderOk = true;
			}
			
			if (!status.equalsIgnoreCase("s") && !status.equalsIgnoreCase("m") 
					&& !status.equalsIgnoreCase("w") && !status.equalsIgnoreCase("d")) {
				System.out.print("\nMarital status must be one of the options (s, m, w, d).\n\n");
			} else {
				statusOk = true;
			}
			
			if (nameOk && ageOk && salaryOk && genderOk && statusOk) {
				System.out.print("\nUser created sucessfully!\nClosing the application...");
				proceed = false;
				scan.close();
			}
		}
	}
}