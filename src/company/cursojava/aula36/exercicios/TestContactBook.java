package company.cursojava.aula36.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class TestContactBook {
	// Additionally the expected, Ask contact book's name and three contacts
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert a name for the contact book: ");
		String cbName = scan.next();
		Contact[] contacts = new Contact[3];
		for (int i = 0; i < contacts.length; i++) {
			System.out.println("Insert the contact name: ");
			String name = scan.next();
			System.out.println("Insert the contact phone number: ");
			String phone = scan.next();
			System.out.println("Insert the email: ");
			String email = scan.next();
			contacts[i] = new Contact(name, phone, email);
		}
		scan.close();
		ContactBook contactBook = new ContactBook(contacts, cbName);
		System.out.println("\n" + contactBook);
	}
}
