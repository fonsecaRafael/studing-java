package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// Ask two numbers, ask what operation does the user want to do. Return the answer and
		// Odd or even? Positive or negative? Integer or decimal?
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number:\t");
		double number = scan.nextDouble();
		System.out.print("\nEnter another any number:\t");
		double number2 = scan.nextDouble();
		System.out.println("What operation do you want realize? (+, -, /, *)");
		char operation = scan.next().charAt(0);
		scan.close();
		
		double result = 0;
		switch (operation) {
		case '+': {
			result = number + number2;
			break;
		}
		case '-': {
			result = number - number2;
			break;
		}
		case '*': {
			result = number * number2;
			break;
		}
		case '/': {
			result = number / number2;
			break;
		}
		default:
			System.out.println("Operation not valid! Closing the application.");
			System.exit(1);
		}
		
		boolean even = result % 2 == 0;
		boolean positive = result >= 0;
		boolean isInteger = result == Math.floor(result) && result == Math.ceil(result);
		
		String strResult = result + "\n";
		if (even) {
			strResult += "Is even.\n";
		} else {
			strResult += "Is odd.\n";
		}
		if (positive) {
			strResult += "Is positive.\n";
		} else {
			strResult += "Is negative.\n";
		}
		if (isInteger) {
			strResult += "Is an Integer.\n";
		} else {
			strResult += "Is a decimal.\n";
		}
		
		System.out.println(strResult);
	}

}
