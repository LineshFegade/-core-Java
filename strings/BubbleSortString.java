package strings;

import java.util.Scanner;

public class BubbleSortString {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	String temp ;
	System.out.println("How much string size :-");
	int size=sc.nextInt();
	String[] arr=new String[size];
	
	System.out.println("Enter the array element:-");        //scanner input values.
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.next();
	}
	// bubble sorted logic.
	for(int i=0;i<arr.length;i++) {   					//this for loop for number of rounds.
		int flag=0;
		for(int j=0;j<arr.length-1-i;j++) {				//this loop for adjuesent elements.
			if(arr[j].compareTo(arr[j+1]) > 0) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {	//here we use flag for when first for loop iteration will complete then not to start iteration that why.
			break;
		}
		 
	}
	System.out.println("Bubble sorted list :-");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
}
}
