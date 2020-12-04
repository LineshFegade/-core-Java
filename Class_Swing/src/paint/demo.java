package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
public class demo extends JFrame{
	Container cp;
	public demo(){
		cp=getContentPane();
		//cp.setBackground(Color.black);	
		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {	
	super.paint(g);
	
	Stroke stroke1 = new BasicStroke(12f);
	 
	//g.setStroke(stroke1);
	g.drawLine(30, 60, 120, 60);
	g.drawLine(30, 60, 30, 150);
	g.drawLine(120, 60, 120, 150);
	g.drawLine(120, 60, 120, 150);
	g.drawLine(30, 150, 120, 150);
	 
	
	g.setColor(Color.green);
	g.drawOval(100, 100, 100, 100);
	
	g.setColor(Color.red);
	g.setFont(new Font("Arial",Font.BOLD,25));
	g.drawString("Welcome to Graphics", 300, 300);
	
	Image img=Toolkit.getDefaultToolkit().getImage("winter.jpg");
	g.drawImage(img, 400, 350, this);
	
}



public static void main(String[] args) {
	new demo();
}
}
