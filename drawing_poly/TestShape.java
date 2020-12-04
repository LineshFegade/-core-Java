package drawing_poly;

public class TestShape {
	public static void main(String[] args) {
		
		Shape[] s= {new Circle(),new Rectangle(),new Square()};
		for (int i = 0; i<s.length; i++) {
			s[i].calculateArea();
		}
	}
}
