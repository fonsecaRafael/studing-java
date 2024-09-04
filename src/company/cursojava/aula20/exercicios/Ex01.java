package company.cursojava.aula20.exercicios;

public class Ex01 {

	public static void main(String[] args) {
		// Create a matrix 4x4 with random values from 0-9, then find out the biggest number and its position
		int[][] matrix = new int[4][4];
		int biggest = 0, x = 0, y = 0;
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) Math.floor(Math.random() * 9);
				if (biggest < matrix[i][j]) {
					biggest = matrix[i][j];
					x = i; y=j;
				}
			}
		}
		System.out.println("Biggest: " + biggest);
		System.out.println("Position: [" + x + "] [" + y + "]");

	}

}