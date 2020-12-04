package mamDemo;

public class Bank implements Runnable{
	Thread t1,t2,t3;
	AccountThread a1=new AccountThread(101,"Akash ",0);
	
	public Bank(){
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);	
		t1.setName("T1");
		t2.setName("T2");		
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*******Account Details *********");
		System.out.println(a1);
		
	}
	
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		if(tname.equals("T1"))
			withdraw(a1,500);
		if(tname.equals("T2"))
			deposit(a1,10000);
		if(tname.equals("T3"))
			withdraw(a1,3500);
		
		
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
			acc.notifyAll();
			System.out.println(Thread.currentThread().getName()+" deposited Acc No= "+acc.getAccNo()+"....Balance="+acc.getBalnace());
		}
	}
	private void withdraw(AccountThread acc, double amt) {
		try {
			synchronized(acc){
				System.out.println(Thread.currentThread().getName()+" withdrawing in Acc No= "+acc.getAccNo()+"....Balance="+acc.getBalnace());
				double temp=acc.getBalnace();
				if(temp<amt){
					System.out.println(Thread.currentThread().getName()+" waiting...");
					acc.wait();				
				}
				temp=acc.getBalnace();
				temp-=amt;
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				acc.setBalnace(temp);	
				acc.notifyAll();
				System.out.println(Thread.currentThread().getName()+" withdrawn Acc No= "+acc.getAccNo()+"....Balance="+acc.getBalnace());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Bank b1=new Bank();
	}
}
