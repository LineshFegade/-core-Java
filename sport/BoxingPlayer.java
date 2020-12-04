package sport;

public class BoxingPlayer extends Players {
	private int points;
	
	public BoxingPlayer(){
		super();
		points=6;
	}
	public BoxingPlayer(int pId,String pName,long nMatch,String cont,int points) {
		super();
		this.points=points;
	}
	public void display() {
		super.display();
		System.out.println("points :-"+points);
	}
	
	
	@Override
	public String toString() {
		String s1=super.toString();
		String s3="\npoints :-"+points;
		return s1+s3;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = (int) points;
	}
	
}
