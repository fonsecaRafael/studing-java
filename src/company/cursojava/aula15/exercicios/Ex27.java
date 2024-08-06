package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// Store that sells fruits table
		// strawberry <= 5kg 2,5/kg -- > 5kg 2,20 /kg
		// apples <= 5kg 1,8/kg -- > 5kg 1,50 /kg
		// If the customer buys more than 8kg or total price is over $25 receives 10% discount
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many kilograms of strawberry do you want?\t");
		double strawberry = scan.nextDouble();
		double priceStrawberry = strawberry > 5 ? 2.2 : 2.5;
		
		System.out.print("How many kilograms of apple do you want?\t");
		double apple = scan.nextDouble();
		double priceApple = apple > 5 ? 1.5 : 1.8;
		scan.close();
		
		double totalKilos = strawberry + apple;
		double totalprice = strawberry * priceStrawberry + apple * priceApple;
		if (totalKilos > 8 || totalprice > 25) {
			totalprice *= 0.9;
		}
		System.out.println("Total to pay:\t" + totalprice);
		
	}

}
