package LoginScreen;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class demo1 extends JFrame{
	Container cp;
	JButton btn1,btn2,btn3;
	
	
	public demo1(){
		cp=getContentPane();	
		cp.setLayout(null); //step-1
		setBackground(Color.ORANGE);
		
		btn1=new JButton("One"); //step-2
		btn2=new JButton("Two");
		btn3=new JButton("Three");
		
		btn1.setBounds(50, 50, 100, 30);//step-3
		btn2.setBounds(50, 150, 100, 30);
		btn3.setBounds(200, 50, 100, 30);
		
		cp.add(btn1);//step-4
		cp.add(btn2);
		cp.add(btn3);
		
		setSize(500, 300);	
		setTitle("My Swing Frame");
		
		setVisible(true);
		//The appln must terminate as soon as the frame is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		demo1 f=new demo1();
		
	}
}
