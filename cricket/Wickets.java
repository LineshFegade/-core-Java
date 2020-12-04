package cricket;

public class Wickets extends Players{
	private long numWickets;
	
	public Wickets() {
		super();
		numWickets=24;
	}
	
	public Wickets(int plaId,String plaName,int numMatch,long numWickets) {
		super(plaId,plaName,numMatch);
		this.numWickets=numWickets;
	}
	public long getNumWickets() {
		return numWickets;
	}

	public void setNumWickets(long numWickets) {
		this.numWickets = numWickets;
	}
	public void display() {
		super.display();
		System.out.println("Wickets :-"+numWickets);
	}
	
	
}
