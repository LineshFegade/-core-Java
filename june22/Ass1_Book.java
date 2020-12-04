package june22;

public class Ass1_Book {
	int bookCode;
	String bookTitle,bookAthor;
	double prize;
	Ass1_Book(){
		bookCode=101;
		bookTitle="Atomic Habits";
		bookAthor="James clear";
		prize=178;
	}
	Ass1_Book(int cd,String title,String athor,double value){
		bookCode=cd;
		bookTitle=title;
		bookAthor=athor;
		prize=value;
	}
	void display() {
		System.out.println("Book Code   :-"+bookCode);
		System.out.println("Book Title  :-"+bookTitle);
		System.out.println("Book Athor  :-"+bookAthor);
		System.out.println("Book Prize  :-"+prize);		
	}
}
