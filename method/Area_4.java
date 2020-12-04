package method;

public class Area_4 {
	
	void square(int base) {
		System.out.println("Area of Square is :"+(base*base));	
	}
	void rectangle(int length,int widht) {		
		System.out.println("Area of Reectangle is :"+(length*widht));	
	}
	
	
	public static void main(String[] args) {
	Area_4 ob=new Area_4();
	ob.square(5);
	ob.rectangle(6,7);
}
}
