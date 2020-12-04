package mamDemo;

public class demo3 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=45;i++){
			String tname=Thread.currentThread().getName();
			if(i==40)
				Thread.yield();
			if(i==2)
				Thread.yield();
			else
				System.out.println(tname+" printed "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		demo3 t1=new demo3();
		t1.setName("T1");
		t1.start();
	}
}
