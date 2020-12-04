package array;
import java.util.*;
public class Array2CommanElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Array Size :-");
	int Size1=sc.nextInt();
	int[] arr1=new int[Size1];
	System.out.println("Enter 1st array Elements :-");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter 2st Array Size :-");
	int Size2=sc.nextInt();
	int[] arr2=new int[Size2];
	System.out.println("Enter 1st array Elements :-");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
	}
	HashSet<Integer> hs1=new HashSet<Integer>();
	HashSet<Integer> hs2=new HashSet<Integer>();
	
	for(int no:arr1) {
		hs1.add(no);
	}
	for(int no:arr2) {
		hs2.add(no);
	}
	System.out.println("Commen elemets between 2 arrays are :-");
	for(int no:hs2) {
		boolean b=hs1.add(no);
		if(b==false) {
			System.out.print(no+" , ");
		}
	}
}
}
