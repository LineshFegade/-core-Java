package client;
import cricket.*;
public class TestPlayers extends Players {
	public static void main(String[] args) {
		
	
	Batsman b1=new Batsman();		
	Batsman b2=new Batsman(7,"MS Dhoni",984,15584);
	b1.display();System.out.println("---------------------------------");
	b2.display();System.out.println("---------------------------------");
	Wickets w1= new Wickets(93,"bumbra",64,104 );
	Wickets w2= new Wickets();
	w1.display();System.out.println("---------------------------------");
	w2.display();System.out.println("---------------------------------");
	
	}
}
