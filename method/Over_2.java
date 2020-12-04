package method;

public class Over_2 {
	void m1(int a) {
		System.out.println(a);
	}

	void m1(int a,int c) { 
		System.out.println(a+" "+c);    	
    }

	public static void main(String[] args) {
		Over_2 ob = new Over_2();
		ob.m1(6);
		ob.m1(8,6);
	}
}
