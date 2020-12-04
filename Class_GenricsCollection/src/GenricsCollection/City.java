package GenricsCollection;
import java.util.*;
public class City {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<String,Citydetails>hs=new HashMap<>();
		
		hs.put("mumbai",new Citydetails("Mumbai","Maharashtra","Gateway of India","Gateway of India, the best place to visit in Mumbai, was built in 1924 by George Willet to honor the visit of King George V and Queen Mary to Mumbai."));
		hs.put("pune",new Citydetails("pune","Maharashtra","Shaniwar Wada Palace","Shaniwarwada which is considered as one of the best pune tourist places. It is a majestic fortification which was built in 1732 and during that time it was the seat of the Peshwas of the Maratha Empire and they ruled over there until 1818. "));
		hs.put("goa", new Citydetails("Goa","goa ","St. Alex Church","located in north goa in arpora calangute built in 1741 opening hour of church is 9 am to 8:30 pm overall nice"));
		hs.put("kerla", new Citydetails("kerla","kerla ","Alleppey","There is the whole of Kerala in one side, and then there is this heavenly tourist destination called Alappuzha or Alleppey! Esteemed as the ‘Backwater Capital of India’ or the ‘Venice of the East’, Alleppey is known for its silent backwaters and bountiful beauty!"));
		hs.put("jammu", new Citydetails("jammu","jammu","Bhimgarh Forts","This hill fort is perched 150 meters above ground and there are different attractions here, including a temple, pond and opulent rooms."));
		hs.put("solapur",new Citydetails("solapur","Maharashtra","Bhuikot Fort","This is old and historical place to visit. Beautiful place for visit. Peaceful environment. There was beautiful park also."));
		hs.put("mumbai",new Citydetails("Mumbai","Maharashtra","Chhatrapati Shivaji Terminus (CST)","Chatrapati Shivaji Terminus is another UNESCO World Heritage Site situated right in the heart of Mumbai. Built in the year 1888, during the British colonial period, this edifice exemplifies the Victorian-Gothic style of architecture."));		
	
		do{Scanner sc=new Scanner(System.in);
		System.out.println("Enter the City name :-");
		String citie=sc.next();
		
		Citydetails info=(Citydetails) hs.get(citie);
		
		if(info !=null) {
			System.out.println(info);
		}
		else
			System.out.println("Not found..!!");
		}while(true);
	}
}
