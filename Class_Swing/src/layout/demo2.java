package layout;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class demo2 extends JFrame{
	Container cp;
	JButton b1,b2,b3,b4,b5,b6;
	
	public demo2(){
		cp=getContentPane();
		cp.setLayout(new BorderLayout(100,100));
		b1=new JButton("b1");
		b2=new JButton("b2");
		b3=new JButton("b3");
		b4=new JButton("b4");
		b5=new JButton("b5");
		b6=new JButton("b6");
		
		cp.add(b1,"North");
		cp.add(b2,"South");
		cp.add(b3,"West");
		cp.add(b4,"East");
		cp.add(b5);
		cp.add(b6);
		
		setSize(500, 500);
		setTitle("Flow Layout");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new demo2();
	}
}
