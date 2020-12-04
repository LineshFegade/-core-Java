package method;

public class Box_9 {
	int res;
	int area(int higth,int width,int depth) {
		res=higth*width*depth;
		System.out.println("Aarea of box :"+res);
		return res;
		
	}
public static void main(String[] args) {
	Box_9 ob=new Box_9();
	ob.area(3,2,2);
}
}
