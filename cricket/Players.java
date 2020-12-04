package cricket;
public class Players {
	private int playerId,numMatches;
	private String playerName;
	private static String country;
	
	static {
		country="India";
	}
	public Players() {
		playerId=45;
		playerName="Rohit Sharma";
		numMatches=217;
	}
	public Players(int playerId,String playerName,int numMatches) {
		this.playerId=playerId;
		this.playerName=playerName;
		this.numMatches=numMatches;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getNumMatches() {
		return numMatches;
	}
	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Players.country = country;
	}
	public void display() {
		System.out.println("Contry :-"+country);
		System.out.println("player Id :-"+playerId);
		System.out.println("player Name:-"+playerName);
		System.out.println("player match No.:-"+numMatches);
	}
	
}
