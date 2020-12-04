package strings;

import java.util.Scanner;

public class InsertionSortString {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		String temp;
		System.out.println("Enter Size of element");
		int size=sc.nextInt();
		System.out.print("Enter elements of array :- ");
		String[] arr=new String[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j].compareTo(arr[j+1])>0) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("Insertions sort list:-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}

