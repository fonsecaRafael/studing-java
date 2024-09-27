package company.cursojava.aula34.exercicios;

public class ConvertTimeUnit {
	// Write static methods to convert:
	//
	// 1 min = 60 sec
	// 1 hr = 60 min
	// 1 day = 24 hr
	// 1 week = 7 days
	// 1 month = 30 days
	// 1 year = 365.25 days
	public static int minsToSec(double min) {
		return (int) Calculator.mult(min, 60);
	}
	public static int hoursToMin(double hours) {
		return (int) Calculator.mult(hours, 60);
	}
	public static int dayToHours(double days) {
		return (int) Calculator.mult(days, 24);
	}
	public static int weekToDays(double week) {
		return (int) Calculator.mult(week, 7);
	}
	public static int monthToDays(double month) {
		return (int) Calculator.mult(month, 30);
	}
	public static double yearToDays(double year) {
		return Calculator.mult(year, 365.25);
	}
}
