package unrelated;

public class batsman extends player implements Pritable {
private long plyerRun;
	
	
	public batsman() {
		super();
		plyerRun=13873;
	}
	public batsman(String playerName,int playerId,int numberOfMatch,String  country,long plyerRun) {
		super(playerName,playerId,numberOfMatch,country);
		this.plyerRun=plyerRun;
	}
	public long getPlyerRun() {
		return plyerRun;
	}

	public void setPlyerRun(long plyerRun) {
		this.plyerRun = plyerRun;
	}
	public void print(){
		super.print();
		System.out.println("players Runs :-"+getPlyerRun());
	}
}
