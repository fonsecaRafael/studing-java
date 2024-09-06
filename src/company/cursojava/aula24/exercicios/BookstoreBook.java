package company.cursojava.aula24.exercicios;

// Modify Ex Book to be a book to sell in a bookstore
public class BookstoreBook extends Book {
	double price;
	String code, barcode;
	

	public BookstoreBook(String title, String author, String releaseDate, String publisher,
			String genre, String code, String barcode, double price) {
		super(title, author, releaseDate, publisher, genre);
		setCode(code);
		setBarcode(barcode);
		setPrice(price);
	}


	private void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	
	private void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBarcode() {
		return barcode;
	}
	
	private void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return String.format("Title: %s\nAuthor: %s\nPrice: %.2f", title, author, price);
	}
	
	public static void main(String[] args) {
		BookstoreBook livro = new BookstoreBook("titulo", "Autor", "16/01/2022", "editora", "aventura", 
				"00001", "541264789", 10.50);
		
		System.out.println(livro.toString());
	} 
}

