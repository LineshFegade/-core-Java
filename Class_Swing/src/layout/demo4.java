package layout;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class demo4 extends JFrame{
	Container cp;
	JButton b1,b2,b3,b4,b5;
	JPanel p1;
	
	public demo4(){
		cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		b1=new JButton("b1");
		b2=new JButton("b2");
		b3=new JButton("b3");
		b4=new JButton("b4");
		b5=new JButton("b5");
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(2,2,20,20));
		p1.setBackground(Color.cyan);		
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
	
		cp.add(b1,"North");
		cp.add(p1,"Center");
		
		
		setSize(500, 500);
		setTitle("Flow Layout");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new demo4();
	}
}
