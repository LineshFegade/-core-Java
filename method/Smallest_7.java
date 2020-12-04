package method;

public class Smallest_7 {
	int res;
	int find(int a,int b,int c) {

		if(a<b && a<c) {
			System.out.println("Smallest number :"+a);
		}
		else if(b<c){
			System.out.println("smallest no :"+b);			
		}
		else {
			System.out.println("smallest no :"+c);
		}
		return res;
		
	}
	public static void main(String[] arg) {
	Smallest_7 ob=new Smallest_7();
	ob.find(3,4,5);
}
}
