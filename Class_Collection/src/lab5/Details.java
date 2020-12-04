package lab5;

import java.util.HashMap;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Details {
@SuppressWarnings({ "unchecked", "rawtypes", "resource" })
public static void main(String[] args) {
	HashMap ht=new HashMap();
	ht.put("mumbai",new Citydetail("Mumbai","Maharashtra","Gateway of India","Gateway of India, the best place to visit in Mumbai, was built in 1924 by George Willet to honor the visit of King George V and Queen Mary to Mumbai."));
	ht.put("pune",new Citydetail("pune","Maharashtra","Shaniwar Wada Palace","Shaniwarwada which is considered as one of the best pune tourist places. It is a majestic fortification which was built in 1732 and during that time it was the seat of the Peshwas of the Maratha Empire and they ruled over there until 1818. "));
	ht.put("goa", new Citydetail("Goa","goa ","St. Alex Church","located in north goa in arpora calangute built in 1741 opening hour of church is 9 am to 8:30 pm overall nice"));
	ht.put("kerla", new Citydetail("kerla","kerla ","Alleppey","There is the whole of Kerala in one side, and then there is this heavenly tourist destination called Alappuzha or Alleppey! Esteemed as the ‘Backwater Capital of India’ or the ‘Venice of the East’, Alleppey is known for its silent backwaters and bountiful beauty!"));
	ht.put("jammu", new Citydetail("jammu","jammu","Bhimgarh Forts","This hill fort is perched 150 meters above ground and there are different attractions here, including a temple, pond and opulent rooms."));
	ht.put("solapur",new Citydetail("solapur","Maharashtra","Bhuikot Fort","This is old and historical place to visit. Beautiful place for visit. Peaceful environment. There was beautiful park also."));
	ht.put("mumbai",new Citydetail("Mumbai","Maharashtra","Chhatrapati Shivaji Terminus (CST)","Chatrapati Shivaji Terminus is another UNESCO World Heritage Site situated right in the heart of Mumbai. Built in the year 1888, during the British colonial period, this edifice exemplifies the Victorian-Gothic style of architecture."));

		
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("Enter city name :");
		  String citie=sc.next(); 
		  Citydetail info=(Citydetail) ht.get(citie);
		 System.out.println(info);
	

	
}
}
