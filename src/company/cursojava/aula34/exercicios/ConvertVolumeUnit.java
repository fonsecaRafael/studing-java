package company.cursojava.aula34.exercicios;

public class ConvertVolumeUnit {
	// Write static methods to convert:
	//
	// 1 l = 1000 cm³
	// 1 m³ = 1000 l
	// 1 m³ = 35.32 f³
	// 1 American gallon = 3785 l 
	public static double litersToCubicCm(double liters) {
		return Calculator.mult(liters, 1000);
	}
	public static double CubicMToLiters(double cubicMeters) {
		return Calculator.mult(cubicMeters, 1000);
	}
	public static double CubicMToCubicF(double cubicMeters) {
		return Calculator.mult(cubicMeters, 35.32);
	}
	public static double americanGallonToLiters(int gallons) {
		return Calculator.mult(gallons, 3785);
	}
}
