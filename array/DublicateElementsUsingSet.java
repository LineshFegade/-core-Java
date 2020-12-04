package array;
import java.util.*;
public class DublicateElementsUsingSet {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of elements :-");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("enter array elements :-");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Dublicate elements are   :-");
	Set<Integer> s=new HashSet<>();
	for(int no:arr) {
		if(s.add(no)==false) {
			System.out.print(no+"  ");
		}
	}
}
}
