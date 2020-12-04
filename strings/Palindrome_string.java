package strings;
import java.util.*;
public class Palindrome_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String rev="";
	System.out.println("Enter String :-");
	String input=sc.nextLine();
	for(int i=input.length()-1;i>=0;i--) {
		rev=rev+input.charAt(i);
	}
	if(input.equals(rev)) {
		System.out.println("This String is Palindrome");
	}
	else {
		System.out.println("This String is Not Palindrome.");
	}
}
}