package mamDemo;

public class demo2 implements Runnable{
	Thread t1,t2,t3,t4;
	AccountThread a1=new AccountThread(105,"Akash wani ", 0);
	AccountThread a2=new AccountThread(108,"Harshal Bendale",0);
	
	public demo2(){
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t4=new Thread(this);
		
		t1.setName("T1");t2.setName("T2");t3.setName("T3");t4.setName("T4");
		
		t1.start();t2.start();t3.start();t4.start();
		
		try {
		    t1.join(); t2.join(); t3.join();t4.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*******Account Details *********");
		System.out.println(a1);
		System.out.println(a2);
	}
	
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		if(tname.equals("T1"))
			deposit(a1,1000);
		if(tname.equals("T2"))
			deposit(a1,1000);
		if(tname.equals("T3"))
			deposit(a2,1000);
		if(tname.equals("T4"))
			deposit(a2, 7000);
		
	}
	private void deposit(AccountThread acc, double amt) {
		synchronized(acc){
			System.out.println(Thread.currentThread().getName()+" depositing in Acc No= "+acc.getAccNo()+"....Balance="+acc.getBalnace());
			
			double temp=acc.getBalnace();
			temp+=amt;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.setBalnace(temp);	
			System.out.println(Thread.currentThread().getName()+" deposited Acc No= "+acc.getAccNo()+"....Balance="+acc.getBalnace());
		}
	}

		@SuppressWarnings("unused")
		public static void main(String[] args) {
			demo2 d1=new demo2();
		}

}
