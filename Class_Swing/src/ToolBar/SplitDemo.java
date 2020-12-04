package ToolBar;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import javax.swing.JFrame;

public class SplitDemo extends JFrame{
	 
	Container cp;
	JSplitPane sp;
	
		
	public SplitDemo(){
		cp=getContentPane();
		JPanel p1=new JPanel();
		p1.setBackground(Color.yellow);
		p1.add(new JButton("Click"));
		
		sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		sp.setLeftComponent(new MyPanel());

		sp.setRightComponent(p1);
		cp.add(sp);
		
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SplitDemo();
	}
}
