package CompareTo;
import java.util.Arrays;

public class TestProduct {
public static void main(String[] args) {
		
		product[] p= {new product(7858,"mobile",15000),
					  new product(1298,"camera",45000),
					  new product(3852,"laptop",39000),
					  new product(9007,"smart watch",8500),
					  new product(6637,"TV  ",65000)
					  };
		
		Arrays.sort(p);
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
}
}
