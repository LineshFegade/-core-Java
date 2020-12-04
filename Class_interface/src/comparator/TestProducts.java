package comparator;
import java.util.ArrayList;
//import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import CompareTo.product;

public class TestProducts {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Products[] p= {new Products(7858,"mobile",15000),
					  new Products(1298,"camera",45000),
					  new Products(3852,"laptop",39000),
					  new Products(9007,"smart watch",8500),
					  new Products(6637,"TV  ",65000)
					  };
		System.out.println("Sorting\n1.code\n2.product name.\n3.product price\n4.end");
		System.out.println("Enter which type of sorting you want :-");
		int ch=sc.nextInt();
		Arrays.sort(p, new SortByCode());
		switch(ch) {
		case 1: Arrays.sort(p,new SortByCode());break;
		case 2: Arrays.sort(p, new SortByproductName());break;
		case 3: Arrays.sort(p,new SortByprice());break;
		case 4: exit(0);
		default: System.out.println("Wrong choice");
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
		
}






private static void exit(int i) {
	// TODO Auto-generated method stub
	
}


}
