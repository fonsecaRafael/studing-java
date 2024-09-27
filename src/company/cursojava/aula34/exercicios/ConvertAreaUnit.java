package company.cursojava.aula34.exercicios;

public class ConvertAreaUnit {
	// Write static methods to convert:
	//
	// 1 m² = 10.76 square foots (sqf)
	// 1 sqf = 929 cm²
	// 1 square mile = 640 acres
	// 1 acre = 43560 sqf
	
	public static double metersToSqf(double meters) {
		return Calculator.mult(meters, 10.76);
	}
	public static double sqfToMeters(double sqf) {
		return Calculator.div(sqf, 10.76);
	}
	public static double sqfToSqCm(double sqf) {
		return Calculator.mult(sqf, 929);
	}
	public static double sqCmToSqf(double sqCm) {
		return Calculator.div(sqCm, 929);
	}
	public static double sqMilesToAcres(double sqMiles) {
		return Calculator.mult(sqMiles, 640);
	}
	public static double acresToSqMiles(double acres) {
		return Calculator.div(acres, 640);
	}
	public static double acresToSqf(double acres) {
		return Calculator.mult(acres, 43560);
	}
	public static double sqfToAcres(double sqf) {
		return Calculator.div(sqf, 43560);
	}
}
