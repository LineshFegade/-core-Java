package lab1;

public class basic extends Thread{
	public void ping() {
		while(true) {
		System.out.println("ping");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void pong() {
		while(true) {
		System.out.println("Pong");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void run() {
		Thread tcurrent=Thread.currentThread();
		String tname=tcurrent.getName();
		if(tname.equals("ping"))
			ping();
		if(tname.equals("pong"))
			pong();
	}
	
	
	
public static void main(String[] args) {
	basic b=new basic();
	basic b1=new basic();
	b1.setName("ping");
	b.setName("pong");
	b.start();
	b1.start();
}
}
