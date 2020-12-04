package animation;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings({ "serial" })
public class Animations extends JFrame implements ActionListener,Runnable{
	Container cp;
	JButton btnStart,btnStop,btnSuspend,btnResume;
	Thread t1,t2,t3,t4;
	JLabel lbl1;
	int x1=1;
	Toolkit tool;
	JTextField txt1;
	JTextArea ta;
	Image i[]=new Image[3];
	Image car;
	int x=5,y=200 ,r=0,g=0,b=0,cnt=0;;
 
	public Animations() {
		 cp=getContentPane();
		 cp.setLayout(new FlowLayout());
		 cp.setBackground(Color.white);
		 
		 
		 btnStart=new JButton("START");
		 cp.add(btnStart);
		 btnStop=new JButton("STOP");
		 cp.add(btnStop);
		 btnSuspend=new JButton("SUSPEND");
		 cp.add(btnSuspend);
		 btnResume=new JButton("RESUME");
		 cp.add(btnResume);
		 txt1=new JTextField();
		 cp.add(txt1);
		 
		 ta=new JTextArea(3,30);
		 ta.setForeground(Color.blue);
	   	ta.setFont(new Font("Arial",Font.BOLD,15));
	   	cp.add(new JScrollPane(ta));
		 
		 lbl1=new JLabel("CAR APPLICATION");
		 lbl1.setFont(new Font("Courier New",Font.BOLD,60));
		 cp.add(lbl1);

		 tool=Toolkit.getDefaultToolkit();		
		    i[0]=tool.getImage("red.png");
	    	i[1]=tool.getImage("green.png");
			i[2]=tool.getImage("yellow.png");
			
			car=tool.getImage("car.png");
		 btnStart.addActionListener(this);
		 btnStop.addActionListener(this);
		 btnSuspend.addActionListener(this);
		 btnResume.addActionListener(this);		 
		 setSize(800,800);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
@SuppressWarnings("unused")
public static void main(String[] args) {
	Animations a=new Animations();
}
@SuppressWarnings("deprecation")
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnStart) {
		t1=new Thread(this);
		t1.setName("car");
		t1.start();
		
		t2=new Thread(this);
		t2.setName("label");
		t2.start();
		
		t3=new Thread(this);
		t3.setName("counter");
		t3.start();
		
		t4=new Thread(this);
		t4.setName("signal");
		t4.start();
	}
	if(e.getSource()==btnStop) {
		t1.stop();t2.stop();t3.stop();t4.stop();
	}
	if(e.getSource()==btnResume) {
		t1.resume();t2.resume();t3.resume();t4.resume();
	}
	if(e.getSource()==btnSuspend) {
		t1.suspend();t2.suspend();t3.suspend();t4.suspend();
	}
	
}
@Override
public void run() {
	String tname=Thread.currentThread().getName();
	if(tname.equals("car")) {
		car();
	}
	if(tname.equals("label")) {
		lableName();
	}
	if(tname.equals("counter")) {
		counter();
	}
	if(tname.equals("signal")) {
		signal();
	}
	
}
private void signal() {
	while(true)
	{
		if(cnt==2)
			cnt=0;
		else
			cnt++;
		repaint();
		try
		{
			Thread.sleep(800);
	    }catch(InterruptedException e){break; }
	     

	 }
	
}
private void counter() {
	while(true) {
		
		if(x1==100) {
			x1=1;
		}
		else {
			ta.setText(" "+x1);
			x1++;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
private void lableName() {
	 while (true)
	 {
		r+=5;
		g+=7;
		b+=11;
		lbl1.setForeground(new Color(r%255,g%255,b%255));	
	try
	{
		Thread.sleep(250);
    }catch(InterruptedException e){break; }
	 }
	
}
private void car() {
	while(true){
		x+=5;
		repaint(); 
		try {
			Thread.sleep(350);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
				}
	}
	
}
public void paint(Graphics g) {
	super.paint(g);

	g.drawImage(car, x, y, this);
    g.drawImage(i[cnt],300,350,this);
}
}
