package constructor_j23;

public class StaticDemo {
	static int num1=10;
	 static int num2=20;
	static String name="Ashu";
	/*
	 * StaticDemo(int num1,int num2){ this.num1=num1; this.num2=num2;
	 * 
	 * }
	 */
	static {
		System.out.println("Static method");
	}
	static void display() {
		System.out.println(num1+" : "+num2+" : "+name);
	}
	public static void main(String[] args) {
		
		//  StaticDemo ob=new StaticDemo(50,60); 
		  //StaticDemo ob1=new StaticDemo(5,6);
		  //StaticDemo ob2=new StaticDemo(55,65); 
		  //StaticDemo ob3=new StaticDemo(50,70);
		  //ob.display(); ob1.display(); ob2.display(); ob3.display();
		 
		display();
	}
}
