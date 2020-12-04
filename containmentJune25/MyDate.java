package containmentJune25;

public class MyDate {
	int date,month,year;
	
	MyDate(){
		date=22;
		month=6;
		year=2020;
	}
	MyDate(int dt,int mn,int yy){
		date=dt;
		month=mn;
		year=yy;	
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if(date>0 && date>=31)
		this.date = date;
		else
			System.out.println("You are Enter Invalid Date..");
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(date>0 && date>=12)
		this.month = month;
		System.out.println("You are Enter Invalid Month..");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
   public void display() { System.out.println(date+"/"+month+"/"+year); }
	
	
	/*
	 * public static void main(String[] args) { MyDate ob=new MyDate();
	 * ob.display(); MyDate ob1=new MyDate(5,12,2014); ob1.display(); }
	 */
}
