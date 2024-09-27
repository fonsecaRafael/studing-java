package company.cursojava.aula36.exercicios;

public class Professor extends Person {
	private String depart, email;

	public Professor(String name, String depart, String email) {
		super(name);
		this.depart = depart;
		this.email = email;
	}
	
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}