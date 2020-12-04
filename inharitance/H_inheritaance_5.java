package inharitance;
class IPLteam{
	void play() {
		System.out.println("IPL 2020");
	}
}
class CSK extends IPLteam{
	
}
class MI extends IPLteam{
	void M(){
		super.play();
	}
}
public class H_inheritaance_5 {
public static void main(String[] args) {
	MI ob=new MI();
	ob.M();
}
}
