package constructor_j23;

public class Book {
private	int bookCode;
private	String bookTitle,bookAthor;
private	double prize;

	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		if(bookCode>0)
		this.bookCode = bookCode;
		else
			System.out.println("Book Code Not Available");
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAthor() {
		return bookAthor;
	}
	public void setBookAthor(String bookAthor) {
		this.bookAthor = bookAthor;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setBookCode(101);
		b1.setBookTitle("Every one has a story");
		b1.setBookAthor("savi sharma");
		b1.setPrize(500);
		
		System.out.println("Book code :-"+b1.getBookCode());
		System.out.println("Book TItle:-"+b1.getBookTitle());
		System.out.println("Book Athor:-"+b1.getBookAthor());
		System.out.println("Book Prize:-"+b1.getPrize());		
	}
}
