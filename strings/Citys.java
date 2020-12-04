package strings;
import java.util.*;
public class Citys {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     String city;
     
     System.out.println("Enter city :-");
     city=sc.nextLine();
     
     switch(city) {
     case "mumbai":
     case "MUMBAI":
     case "mum":
     case "Mumbai":
     case "MUM":
    	 System.out.println("Mumbai is the commercial capital of India. It is also known as the city that never sleeps. Mumbai is the perfect blend of culture, customs and lifestyles.");
    	 			break;
     case "pune":
     case "Pune":
     case "PUNE":
     case "PU":
    	 System.out.println("Pune also called Poona, city, west-central Maharashtra state, western India, at the junction of the Mula and Mutha rivers. Called “Queen of the Deccan,” Pune is the cultural capital of the Maratha peoples. The city first gained importance as the capital of the Bhonsle Marathas in the 17th century.");
    	   break;
    
     case "Nashik":
     case "NASHIK":
     case  "nashik":
     case "nas":
     case "Nas":
    	 System.out.println("Nashik is an ancient city in the northern region of the Indian state of Maharashtra. Situated on the banks of river Godavari, that of Kumbh Mela which is held every 12 years.");break;
    	 			
     case "Rajastan":
     case "RAJASTAN":
     case  "Raj":
     case "RAJ":
     case "raj":
    	 System.out.println(" Johari bazaar in Jaipur is an ecstasy for jewelry lovers. In fact, Jaipur is flourished with some of the best jewelries in India, and it does not only offer gold or silver jewelry but also hand-cut precious and semi-precious stones and gems.");break;
    	 			
     case "JAIPUE":
     case "Jaipur":
     case "jaipur":
     case "Jai":
     case "jai":
    	 			System.out.println("Jaipur is the erstwhile princely city ruled by legendary royals who brought the crowning glory to the city by embellishing it with numerous stunning edifices. The royal members or some of the nobles used to live in these palaces or Hawelis. ");break;
    	 			
    	 			
    	default:System.out.println("Not a city available"); 			
    	 			
     }
}
}
