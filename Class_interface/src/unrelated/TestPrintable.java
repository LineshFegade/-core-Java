package unrelated;

public class TestPrintable {
public static void main(String[] args) {
	Pritable[] p1= {new student("Akash",65),new batsman("M S Dhoni",7,1108,"india",1450),new Accounts("pratik",528756,8433) };
	for (int i = 0; i < p1.length; i++) {
		p1[i].print();
		System.out.println("------------------------------------");
	}
	
	}
}
