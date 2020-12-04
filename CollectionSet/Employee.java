package CollectionSet;

public class Employee {
	private int EId,Esalary;
	private String EPosition,Ename;
	public Employee(int eId, String ename,String ePosition,int esalary) {
		super();
		EId = eId;
		Esalary = esalary;
		EPosition = ePosition;
		Ename = ename;
	}
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public int getEsalary() {
		return Esalary;
	}
	public void setEsalary(int esalary) {
		Esalary = esalary;
	}
	public String getEPosition() {
		return EPosition;
	}
	public void setEPosition(String ePosition) {
		EPosition = ePosition;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "[emloyye id=" + EId + ", employee salary=" + Esalary + ", employee position=" + EPosition + ", employee name=" + Ename + "]";
	}
	
	
	
	
}
