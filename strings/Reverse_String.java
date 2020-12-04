package strings;
import java.util.*;
public class Reverse_String {
public static void main(String[] args) {
	String rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:-");
	String input=sc.nextLine();
	for(int i=input.length()-1;i>=0;i--) {
		rev=rev+input.charAt(i);
	}
	System.out.println("Reverse String :-"+rev);
}
}
