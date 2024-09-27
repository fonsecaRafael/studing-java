package company.cursojava.aula36.exercicios;

public class Student extends Person {
	float[] grades;
	float media;

	public Student(String name, float[] grades) {
		super(name);
		this.grades = grades;
		media = 0.0f;
	}

	private float calcMedia() {
		media = 0;
		for(float grade: grades) {
			media += grade;
		}
		return media /= grades.length;
	}
	
	public float getMedia() {
		calcMedia();
		return media;
	}
	
	public float[] getGrades() {
		return grades;
	}
	
	public void setGrades(float[] grades) {
		this.grades = grades;
	}
	
	public String toString() {
		String approved = (media < 7) ? "\nNOT APPROVED\n" : "\nAPPROVED\n";
		return "Student: " + name + approved + "Media: " + media;
	}
}
