package inharitance;

class Laptop{
	int noOfUsbPort;
	int processorSped;
	public int getNoOfUsbPort() {
		return noOfUsbPort;
	}
	public void setNoOfUsbPort(int noOfUsbPort) {
		this.noOfUsbPort = noOfUsbPort;
	}
	public int getProcessorSped() {
		return processorSped;
	}
	public void setProcessorSped(int processorSped) {
		this.processorSped = processorSped;
	}
	
	
	
	
}

public class H_inheritance_4 {
	public static void main(String[] args) {
		Laptop ob=new Laptop();
		ob.setNoOfUsbPort(4);
		ob.setProcessorSped(50);
		
		
		
		System.out.println(ob.getNoOfUsbPort());
		System.out.println(ob.getProcessorSped());
		
		int a=ob.getProcessorSped();
		System.out.println(a);
	}
	
}
