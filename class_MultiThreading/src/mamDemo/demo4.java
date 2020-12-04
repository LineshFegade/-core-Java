package mamDemo;

public class demo4 extends Thread{
	
	@Override
	public void run() {
		printAlpha();
		printNum();
	}

	private void printAlpha() {
		for(int ch=65;ch<=90;ch++){
			System.out.print("  "+(char)ch);
			
			try {
				Thread.sleep(500);//delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	private void printNum() {
		for(int i=1;i<=20;i++){
			System.out.print("  \n"+i);
			
			try {
				Thread.sleep(500);//delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args)  {
		System.out.println("Main Thread started!");
		
		demo4 t1=new demo4();
	Thread t2=new Thread();
		//t1.setDaemon(true);
		t1.setName("ALPHA");
		t1.start();

		t2.setName("Number ");
		t2.start();
		//here main thread will get blocked until t1 completes
		try {
			  t1.join();
			// t2.join();
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nMain Thread terminated!");
	}

}
