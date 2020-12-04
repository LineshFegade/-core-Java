package ThreadSyncronization;

public class DemoSyncronization implements Runnable{
	Thread t1,t2,t3;
	
	public DemoSyncronization() {
		t1=new Thread(this);
		t1.setName("th1");
		t1.start();
		
		t2=new Thread(this);
		t2.setName("th2");
		t2.start();
		
		t3=new Thread(this);
		t3.setName("th3");
		t3.start();
				
	}
	
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		if(tname.equals("th1")) {
			massagePrint("HELLO");
		}
		if(tname.equals("th2")) {
			massagePrint("HI");
		}
		if(tname.equals("th3")) {
			massagePrint("BYE");
		}
	}

	public  synchronized  void massagePrint(String msg) {
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(msg);  //
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(msg);//
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(msg);//
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		DemoSyncronization	d=new DemoSyncronization();
	}

}
