package strings;
import java.util.*;
public class UpperCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String :-");
	String input=sc.nextLine();
	input=input.toUpperCase();
	System.out.println("upper case string:-"+input);
}
}
