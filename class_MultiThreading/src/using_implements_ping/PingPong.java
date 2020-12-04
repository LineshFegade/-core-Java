package using_implements_ping;

public class PingPong  implements Runnable{
	//Methods
	public void ping() {
		while(true) {
		System.out.println("Ping..");
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
		System.out.println("pong..");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	
	//MAIN Methods
public static void main(String[] args) {
	Thread t=new Thread(new PingPong());
	Thread t1=new Thread(new PingPong());
	t.setName("ping");
	t1.setName("pong");
	
	t.start();
	t1.start();
	
}

@Override
public void run() {
	Thread tcurrect= Thread.currentThread();
	String tname=tcurrect.getName();
	if(tname.equals("ping")) {
		ping();
	}
	if(tname.equals("pong")) {
		pong();
	}
}
}
