package OOPS;
import java.io.*;
import java.util.*;
public class months_3 {
    Scanner sc=new Scanner(System.in);
    int ch;
    void Month() {
    	System.out.println("Enter the months :");
    	ch=sc.nextInt();
    	switch(ch) {
    	case 1:System.out.println("31 days");break;
    	case 2:System.out.println("28 days");break;
    	case 3:System.out.println("31 days");break;
		case 4:System.out.println("30 days");break;
		case 5:System.out.println("31 days");break;
		case 6:System.out.println("30 days");break;
		case 7:System.out.println("31 days");break;
		case 8:System.out.println("31 days");break;
		case 9:System.out.println("30 days");break;
		case 10:System.out.println("31 days");break;
		case 11:System.out.println("30 days");break;
		case 12:System.out.println("31 days");break;
    	default :System.out.println("WRONG CHOICE......");
    	}
    }
	
	
	public static void main(String[] args) {
	months_3 ob=new months_3();
	ob.Month();
}
}
