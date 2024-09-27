package company.cursojava.aula36.exercicios;

public class Course {
	// It has name and hour, a professor, 0 or many students
	// Professors have name, depart and email
	// Each Alumn has name, code and 4 grades.
	String name;
	Professor professor;
	Student[] students;
	
	public float media() {
		float sum = 0;
		for(Student student : students) {
			sum += student.getMedia();
		}
		return sum/students.length;
	}
	
	public Course(String name, Professor professor, Student[] students) {
		this.name = name;
		this.professor = professor;
		this.students = students;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
}
