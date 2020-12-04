package sport;

public class BasketBallPlayer extends Players{
	private int baskets;
	
	public BasketBallPlayer(){
		super();
		baskets=58;
	}
	public BasketBallPlayer(int playerId,String playerName,long numMatch,String country,int baskets) {
		super(playerId,playerName,numMatch,country);
		this.baskets=baskets;
	}
	public void display() {
		super.display();
		System.out.println("number of baskets :-"+baskets);
	}
	
	@Override
	public String toString() {
		String s1=super.toString();
		 String s4="\nnumber of Baskets :-"+baskets;
		 return s1+s4;
	}
	public int getBaskets() {
		return baskets;
	}
	public void setBaskets(int baskets) {
		this.baskets = baskets;
	}
	
	
}
