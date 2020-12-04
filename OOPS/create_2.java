package OOPS;

public class create_2 {
	 
	void simple(){
		int a=9,b=89;
		int res=a+b;
		System.out.println(res);
	}
	void use() {
		int a=4,b=5;
		int res=a*b;
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		create_2 ob=new create_2();
		create_2 ob1=new create_2();
		ob.simple();
		ob1.use();
	}
}
