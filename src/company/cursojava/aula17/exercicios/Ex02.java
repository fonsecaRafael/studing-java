package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Read user name and password if they are equal, show error message and ask again
		Scanner scan = new Scanner(System.in);
		boolean proceed = true;
		String username, password;
		
		while(proceed) {
			System.out.print("Insert the user name: ");
			username = scan.next();
			System.out.print("Insert the password: ");
			password = scan.next();
			
			if (!username.equals(password)) {
				scan.close();
				System.out.print("\nUser created.");
				proceed = false;
				break;
			}
			System.out.print("Username and password must be different.\n\n");
		}
	}

}
