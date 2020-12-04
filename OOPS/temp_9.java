package OOPS;
import java.util.*;
import java.io.*;
public class temp_9 {
	Scanner sc=new Scanner(System.in);
	float cel,res;
	void tempo() {
		System.out.println("Enter celcies temprature :");
		cel=sc.nextInt();
		res=(cel*1.8f)+32;
		System.out.println(cel+"converted into Fahrenheit is"+res);
	}
public static void main(String[] args) {
	temp_9 ob=new temp_9();
	ob.tempo();
}
}
