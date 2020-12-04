package cricket;
public class Batsman extends Players{
	private long numRuns;
	public Batsman() {
		super();
		numRuns=9115;
	}
	public Batsman(int plaId,String plaName,int numMatch,long numRuns) {
		super(plaId,plaName,numMatch);
		this.numRuns=numRuns; 
	}
	public void display() {
		super.display();
		System.out.println("Runs :-"+numRuns);
	}
	public long getNumRuns() {
		return numRuns;
	}
	public void setNumRuns(long numRuns) {
		this.numRuns = numRuns;
	}
}
