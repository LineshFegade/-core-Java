package june22;

public class Mydate {
	int date;
	int year;
	String month;
	Mydate(){
		date=22;
		month="june";
		year=2020;
	}
	Mydate(int dt,String mn,int yy){
		date=dt;
		month=mn;
		year=yy;	
	}
	void display() {
		System.out.println(date+" day "+month+" month  "+year+" Year ");
	}
}
