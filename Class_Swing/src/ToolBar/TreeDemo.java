package ToolBar;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

@SuppressWarnings("serial")
public class TreeDemo extends JFrame{
	Container cp;
	DefaultMutableTreeNode alphabets,a,b,a1,a2,a3,b1,b2,b3;
	JTree tree;
	JPanel p1;
	
	public TreeDemo(){
		cp=getContentPane();
		cp.setBackground(Color.white);
		p1=new JPanel();
		p1.setBackground(Color.white);
		alphabets=new DefaultMutableTreeNode("Alphabets");
		a=new DefaultMutableTreeNode("A");
		b=new DefaultMutableTreeNode("B");
		a1=new DefaultMutableTreeNode("Apple");
		a2=new DefaultMutableTreeNode("Angel");
		a3=new DefaultMutableTreeNode("America");
		b1=new DefaultMutableTreeNode("Ball");
		b2=new DefaultMutableTreeNode("Basket");
		b3=new DefaultMutableTreeNode("Balloon");
		
		a.add(a1);a.add(a2);a.add(a3);		
		b.add(b1);b.add(b2);b.add(b3);
		alphabets.add(a);
		alphabets.add(b);
		
		tree=new JTree(alphabets);
		p1.add(tree);
		add(p1,"West");
		
		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TreeDemo();
	}
}
