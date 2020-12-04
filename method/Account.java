package method;
import java.util.*;
import java.io.*;
public class Account {
	Scanner sc=new Scanner(System.in);
	int Ac_no,choice;
	String name;
	float amount;
	
 void insert() {
	 System.out.println("Enter Name->");
	 name=sc.nextLine();
	 System.out.println("Enter the Ac_no :");
	 Ac_no=sc.nextInt();
	 System.out.println("Enter amount");
	 amount =sc.nextFloat();
	 
 }
 void Details() {
	 do {
		 System.out.println("Menu :\n1.Display.\n2.Deposit.\n3.withdraw.\n4.check_Balance");
		 System.out.println("Enter your choice :");
		 choice=sc.nextInt();
		 
		 switch(choice) {
		 case 1: 
			 System.out.println(" Account Holder Name :"+name);
			 System.out.println(" Ac_no :"+Ac_no);
		 System.out.println("Enter amount :"+amount);
		 System.out.println("________________________________________________________________________________________");
		 break;
		 
		 case 2:
			 System.out.println(" Account Holder Name :"+name);
			 System.out.println("Ac_no :"+Ac_no);
			 System.out.println("Enter Diposit Amount :");
		        int deposit=sc.nextInt();
		        amount+=deposit;
		        System.out.println("Total Balance is :"+amount);
				 System.out.println("________________________________________________________________________________________");

		        break;
		 case 3:
			 System.out.println(" Account Holder Name :"+name);
			 System.out.println(" Ac_no :"+Ac_no);
			 System.out.println("Enter your Withdraw Amount :");
		        float withdraw=sc.nextFloat();
		        amount-=withdraw;
		        System.out.println("Total Balance is :"+amount);
				 System.out.println("________________________________________________________________________________________");

		        break;
		 case 4:
			 System.out.println("Account Holder Name :"+name);
			 System.out.println("Ac_no :"+Ac_no);
			 System.out.println("current Balance is :"+amount);
			 System.out.println("________________________________________________________________________________________");

		 		break;
		 		default :System.out.println("Sorry....Wrong Choice...");
		 				 }
	 }while(choice!=4);
 }
	public static void main(String[] args) {
	Account ob=new Account();
	ob.insert();
	ob.Details();
}
}
