package company.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// matrix [days][hours] the costumer should be able see and change the appointment
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		String[][] calendar = new String[30][24];
		
		String option = "", appointment;
		int day, hour;
		while(running) {
			System.out.println("Press 1 to add an appointment");
			System.out.println("Press 2 to see an appointment");
			System.out.println("Press 3 to change an appointment");
			System.out.println("Press any other key to close the application");
			
			option = scan.next();
			if (!option.equals("1") && !option.equals("2") && !option.equals("3")) {
				System.out.println("Encerrando a aplicação.");
				System.exit(0);
			} else {
				System.out.println("When is the day?");
				day = scan.nextInt();
				System.out.println("What time do you want?");
				hour = scan.nextInt();
				
				if (option.equals("2")) {
					System.out.println("The actual appointment: " + calendar[day][hour]);
					continue;
				}else {
					System.out.println("What is the appointment?");
					appointment = scan.next();
					
					calendar[day][hour] = appointment;
					if(option.equals("1")) {
						System.out.println("Appointment registered at day: " + day + " Hour: " + hour);
						continue;
					}
					System.out.println("Appointment changed at day: " + day + " Hour: " + hour);
				}
			}
		}
		scan.close();
	}
}