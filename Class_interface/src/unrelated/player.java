package unrelated;

public class player implements Pritable{
	private int playerId,numberOfMatch;
	private String country,playerName;
	
	public int getPlayerId() {
		return playerId;
	}
	
	public player() {
		playerName="Scahin";
		playerId=10;
		numberOfMatch=1589;
		country="India";		
	}
	public player(String playerName,int playerId,int numberOfMatch,String  country) {
		this.playerName=playerName;
		this.playerId=playerId;
		this.numberOfMatch=numberOfMatch;
		this.country=country;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getNumberOfMatch() {
		return numberOfMatch;
	}
	public void setNumberOfMatch(int numberOfMatch) {
		this.numberOfMatch = numberOfMatch;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public void print() {
		System.out.println("\t**Player Details**");
		System.out.println("player name :-"+getPlayerName());
		System.out.println("player id   :-"+getPlayerId());
		System.out.println("Number of match:-"+getNumberOfMatch());
		System.out.println("contry :-"+getCountry());
		
	}
	
}
