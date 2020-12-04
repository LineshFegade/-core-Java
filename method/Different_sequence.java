package method;

public class Different_sequence {
	void me1(int n,char c) {
		System.out.println("method 1 :"+n+" "+c);
		
	}
	void me2(char c,int n) {
		System.out.println("method 2 :"+c+" "+n);
	}
public static void main(String[] args) {
	Different_sequence ob=new Different_sequence();
	ob.me1(3,'A');
	ob.me2('c',5);
}
}
