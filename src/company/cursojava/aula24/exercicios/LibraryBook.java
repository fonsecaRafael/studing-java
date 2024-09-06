package company.cursojava.aula24.exercicios;

public class LibraryBook extends Book{
	// Modify ex 2 to be a book in a library that can be borrowed by readers
	
	String code, lastBorrowDate, nextReturnDate;
	//[Who] [borrowed date] [max return date] [return date]
	String[][] borrowedBy = new String[10][4];
	
	public LibraryBook(String title, String author, String releaseDate, String publisher, String genre,
			String code, String lastBorrowDate, String nextReturnDate) {
		
		super(title, author, releaseDate, publisher, genre);
		setCode(code);
		setLastBorrowDate(lastBorrowDate);
		setNextReturnDate(nextReturnDate);
		
	}

	private void setNextReturnDate(String nextReturnDate) {
		this.nextReturnDate = nextReturnDate;
	}
	public String getNextReturnDate() {
		return nextReturnDate;
	}

	private void setLastBorrowDate(String lastBorrowDate) {
		this.lastBorrowDate = lastBorrowDate;
	}
	public String getLastBorrowDate() {
		return lastBorrowDate;
	}

	private void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	
	private void borrow(String reader, String actualDate, String returnDate) {
		boolean registered = false;
		for(int i = 0; i < borrowedBy.length; i++) {
			if(borrowedBy[i][0] == null) {
				borrowedBy[i][0] = reader;
				borrowedBy[i][1] = actualDate;
				borrowedBy[i][2] = returnDate;
				registered = true;
			}
		}
		
		if(!registered) {
			for (int i = borrowedBy.length - 2; i > -1; i--) {
				borrowedBy[i+1][0] = borrowedBy[i][0];
				borrowedBy[i+1][1] = borrowedBy[i][1];
				borrowedBy[i+1][2] = borrowedBy[i][2];
				borrowedBy[i+1][3] = borrowedBy[i][3];
			}
			borrowedBy[0][0] = reader;
			borrowedBy[0][1] = actualDate;
			borrowedBy[0][2] = returnDate;
		}
	}
}
