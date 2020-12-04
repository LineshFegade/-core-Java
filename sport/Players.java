package sport;

public class Players {
  private int playerId;
  private long numMatch;
  private String playerName,country;
  
  public Players(){
	  playerId=7;
	  numMatch=1058;
	  playerName="M S DHONI";
	  country="india";
    }
  public Players(int playerId,String playerName,long numMatch,String country) {
	  this.playerId=playerId;
	  this.playerName=playerName;
	  this.numMatch=numMatch;
	  this.country=country;
  }
  
      public void display() {
		 System.out.println("Player id:-"+playerId);
		  System.out.println("Player Name:-"+playerName);
		  System.out.println("Number of matches:-"+numMatch);
		  System.out.println("country :-"+country);
		
	}
		@Override
	public String toString() {
		String s1="Player id:-"+playerId+"\nPlayer Name:-"+playerName+"\nNumber of matches:-"+numMatch+"\ncountry :-"+country;
		return s1;
	}
		public int getPlayerId() {
			return playerId;
		}
		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}
		public long getNumMatch() {
			return numMatch;
		}
		public void setNumMatch(long numMatch) {
			this.numMatch = numMatch;
		}
		public String getPlayerName() {
			return playerName;
		}
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		



}
