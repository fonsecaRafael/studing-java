package company.cursojava.aula34.exercicios;

public class TestConvertAreaUnit {

	public static void main(String[] args) {
		System.out.println(ConvertAreaUnit.acresToSqf(1));
		System.out.println(ConvertAreaUnit.sqfToAcres(43560));
		System.out.println();
		System.out.println(ConvertAreaUnit.acresToSqMiles(640));
		System.out.println(ConvertAreaUnit.sqMilesToAcres(1));
		System.out.println();
		System.out.println(ConvertAreaUnit.metersToSqf(1));
		System.out.println(ConvertAreaUnit.sqfToMeters(10.76));
		System.out.println();
		System.out.println(ConvertAreaUnit.sqCmToSqf(929));
		System.out.println(ConvertAreaUnit.sqfToSqCm(1));
	}

}
