package GenricsCollection;

public class Books implements Comparable<Books>{
	private int bookcode;
	private String bookName;
	private long prise;
	public Books(int bookcode, String bookName, long prise) {
		super();
		this.bookcode = bookcode;
		this.bookName = bookName;
		this.prise = prise;
	}
	public int getBookcode() {
		return bookcode;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public long getPrise() {
		return prise;
	}
	public void setPrise(long prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Books [bookcode=" + bookcode + ", bookName=" + bookName + ", prise=" + prise + "]";
	}
	@Override
	public int compareTo(Books o) {
		if(this.getBookcode() == o.getBookcode()) {
			return 0;
		}
		else if(this.getBookcode()< o.getBookcode()) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
	
}
