package company.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Modify Ex04, for all year but only for 8 hours per day
		Scanner scan = new Scanner(System.in);
		String[][][] calendar = new String[12][30][8];
		String appointment, option;
		int month, day, hour;
		
		while(true) {
			System.out.println("Press 1 to add an appointment");
			System.out.println("Press 2 to see an appointment");
			System.out.println("Press 3 to change an appointment");
			System.out.println("Press another key to close the application");
			
			option = scan.next();
			if (option.equals("1") || option.equals("2") || option.equals("3")) {
				System.out.println("What month? (1-12)");
				month = scan.nextInt() - 1;
				System.out.println("What day? (1-30)");
				day = scan.nextInt() - 1;
				System.out.println("What hour? (1-8)");
				hour = scan.nextInt() - 1;
				if (option.equals("2")) {
					System.out.println("The actual appointment: " + calendar[month][day][hour]);
					continue;
				}else {
					System.out.println("What is the appointment?");
					appointment = scan.next();
					calendar[month][day][hour] = appointment;
					if (option.equals("1")) {
						System.out.println("Appointment registred at month: " + (month + 1) 
								+ " day: " + (day + 1) + " hour: " + (hour + 1));
					}else {
						System.out.println("Appointment changed at month: " + (month + 1) 
								+ " day: " + (day + 1) + " hour: " + (hour + 1));
					}
					continue;
				}
			}
			System.out.println("Closing the application...");
			break;
		}
		scan.close();
	}
}