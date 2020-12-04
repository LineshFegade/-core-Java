package constructor_j23;

public class Date {
	int date;
	int year;
	String month;
	
public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
public static void main(String[] args) {
	  Date obj=new Date();
	  obj.setDate(5);
	  obj.setMonth("Jan");
	  obj.setYear(2020);
	  
	  System.out.println(obj.getDate()+" Date "+obj.getMonth()+" Month "+obj.getYear()+" year ");
}
}
