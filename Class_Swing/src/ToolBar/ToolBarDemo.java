package ToolBar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ToolBarDemo extends JFrame implements ActionListener{
	Container cp;
	JToolBar tb;
	JButton b1,b2,b3,b4;
	
	
	public ToolBarDemo(){
		cp=getContentPane();
		cp.setBackground(Color.orange);
		b1=new JButton(new ImageIcon("save.png"));
		b2=new JButton(new ImageIcon("print.png"));
		b3=new JButton(new ImageIcon("color.png"));
		b4=new JButton(new ImageIcon("exit.jpg"));
		
		tb=new JToolBar();
		tb.setFloatable(true); //user can drag the tb 
		tb.add(b1);
		tb.addSeparator();
		tb.add(b2);
		tb.addSeparator();
		tb.add(b3);
		tb.addSeparator();
		tb.add(b4);
		cp.add(tb,"North");
		
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color clr=JColorChooser.showDialog(ToolBarDemo.this,"color box",null);
				cp.setBackground(clr);
				
			}
		});
		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ToolBarDemo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
