package sport;

public class FootBallPlayer extends Players {
	private int goals;
	
	public FootBallPlayer() {
		super();
		goals=441;
	}
	public FootBallPlayer(int playerId,String playerName,long numMatch,String country,int goals) {
		super(playerId,playerName,numMatch,country);
		this.goals=goals;
	}
	public void display() {
		super.display();
		System.out.println("Number of goals :-"+goals);
	}
	
	@Override
	public String toString() {
		String s1=super.toString();
		String s2="\nNumber of goals :-"+goals;
		 return s1+s2;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
}
