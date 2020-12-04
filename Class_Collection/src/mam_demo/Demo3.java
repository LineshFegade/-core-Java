package mam_demo;
import java.util.*;
public class Demo3 {
	
	public static void main(String[] args) {
		Properties p=new Properties();
		p.put("Pune","famous for education & historical places");
		p.put("Mumbai","famous for employment");
		p.put("Jaipur","famous for forts & palaces");
		p.put("Kerala","famous for backwaters");
		p.put("Goa","famous for beaches & churches");
		
		System.out.println("Enter city name to search:");
		Scanner sc=new Scanner(System.in);
		String city=sc.next();
		
		String info=p.getProperty(city);
		if(info !=null)
			System.out.println(info);
		else
			System.out.println("City not found!!");
		
		
	}

}
