package company.cursojava.aula36.exercicios;

public class TestCourse {
	// Create a course with 5 students, user should insert 4 grades for each alumn
	// after, show the media for each alumn, if media > 7 approved, and media of all alumns
	public static void main(String[] args) {
		Professor professor = new Professor("Elias", "History", "elias@gmail.com");
		Student[] students = new Student[] {
			new Student("Student One", new float[]{6.1f, 6.2f, 6.3f, 6.4f}),
			new Student("Student Two", new float[]{7.0f, 7.0f, 7.0f, 7.0f}),
			new Student("Student Three", new float[]{8.1f, 8.2f, 8.3f, 8.4f}),
			new Student("Student four", new float[] {9.1f, 9.2f, 9.3f, 9.4f}),
			new Student("Student five", new float[] {10.0f, 10.0f, 10.0f, 10.0f})
		};
		Course course = new Course("History Couse", professor, students);
		
		for(Student student: course.students) {
			student.getMedia();
			System.out.println((student.toString()) + "\n");
		}
	}
}
