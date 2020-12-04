package strings;

import java.util.Scanner;

public class SelectionSortString {
private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
	int min;
	String temp="";
	System.out.println("Enter size of elements");
	int size=sc.nextInt();
	
	System.out.println("Enter the array elements :-");
	String[] arr=new String[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.next()
;		}
	
	for(int i=0;i<arr.length;i++)
	{
		min=i;
		for(int j=i+1;j<arr.length;j++) {     // this loop for searching smallest eleemnt
			
			if(arr[j].compareTo(arr[min])<0) {
				min=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	System.out.println("Section sort array elements are :-");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
}
}
