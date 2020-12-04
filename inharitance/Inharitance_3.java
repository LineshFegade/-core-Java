package inharitance;


class Rectangle{
	int length,bridth;
	Rectangle(int length,int bridth){
		this.length=length;
		this.bridth=bridth;
	}
	void area() {
		System.out.println("Area of rectangle:");
		System.out.println(length*bridth);
	}
	void parimeter() {
		System.out.println("Area of parimeter :"+2*(length+bridth));
	}
}
class Square extends Rectangle{
	Square(int s){
		super(4,6);
		System.out.println("area of square :"+s*s);

	}
}
public class Inharitance_3 {
public static void main(String[] args) {
		Square s=new Square(5);
		s.area();
}
}
