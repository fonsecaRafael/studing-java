package company.cursojava.aula24.exercicios;

//Create a 	book class that represents a basic data of books
public class Book{
	String title, author, releaseDate, publisher, genre;
	
	public Book(String title, String author, String releaseDate, String publisher, String genre) {
		setTitle(title);
		setAuthor(author);
		setReleaseDate(releaseDate);
		setPublisher(publisher);
		setGenre(genre);
	}
	
	private void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	private void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	
	private void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseDatee() {
		return this.releaseDate;
	}
	
	private void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return this.publisher;
	}
	
	private void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return this.genre;
	}
}
