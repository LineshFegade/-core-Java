package array;

import java.util.Scanner;

public class Min_Max_ElementsInArrays {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array :-");
		int Size=sc.nextInt();
		
		int[] arr=new int[Size];
		int max=arr[0], min=arr[0];
		System.out.println("Enter the Array Elements :-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(min>arr [i]) {
				min=arr[i];
			}
		}
		
		
		System.out.println("Maximum number in array is  :"+max);
		System.out.println("Minimum number in array is  :"+min);
}
}
