package ToolBar;

import javax.swing.*;
import java.awt.*;
public class TabDemo extends JFrame{
	Container cp;
	JPanel p1,p2,p3;
	JTabbedPane tb;	
		
	public TabDemo(){
		cp=getContentPane();
		p1=new JPanel();
		p1.setBackground(Color.yellow);
		p1.add(new JButton("Click"));
		
		p2=new JPanel();		
		p2.setBackground(Color.blue);
		
		p3=new JPanel();
		p3.setBackground(Color.black);
		
		tb=new JTabbedPane();
		tb.add("First",p1);
		tb.add("Second",p2);
		tb.add("Third",p3);
		tb.add("Fourth",new MyPanel());
		cp.add(tb);
		
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TabDemo();
	}
}
