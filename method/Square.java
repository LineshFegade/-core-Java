package method;

public class Square {
	static int area=0;
	static int calculateArea(int length) {
		area=length*length;
		return area;
	}
	public static void main(String[] args) {
		Square ob=new Square();
		ob.calculateArea(20);
		System.out.println("length of squre is :"+area);
	}

}
