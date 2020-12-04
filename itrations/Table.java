package itrations;
import java.io.*;
import java.util.*;
public class Table {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	/*System.out.println("Enter table number :");
	int num=sc.nextInt();*/
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=10;j++)
		{		
			
		System.out.print(i*j+ "   ");
	}
		System.out.println();
	}
}
}
