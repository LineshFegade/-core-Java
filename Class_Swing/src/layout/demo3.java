package layout;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class demo3 extends JFrame{
	Container cp;
	JButton b1,b2,b3,b4,b5,b6;
	
	public demo3(){
		cp=getContentPane();
		cp.setLayout(new GridLayout(5,4));
		//cp.setLayout(new FlowLayout());
		
		b1=new JButton("b1");
		b2=new JButton("b2");
		b3=new JButton("b3");
		b4=new JButton("b4");
		b5=new JButton("b5");
		b6=new JButton("b6");
		
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		cp.add(b5);
		cp.add(b6);
		
		setSize(500, 500);
		setTitle("Flow Layout");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new demo3();
}
}
