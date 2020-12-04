package paint;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Banner extends JFrame{
	Container cp;
	
	public Banner() {
		cp=getContentPane();
		cp.setBackground(Color.white);	
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
@Override
	public void paint(Graphics g) {
		super.paint(g);
		 g.fillRect(15, 15,650, 800);  
		 g.setColor(Color.BLACK);
		
		
		  Image img=Toolkit.getDefaultToolkit().getImage("thk.jpg"); 
		  g.drawImage(img,30, 35, this);
		  
		  g.setColor(Color.red);
			g.setFont(new Font("Yu Gothic Bold",Font.BOLD,80));
			g.drawString("THANK YOU...", 48, 480);
			 g.setColor(Color.YELLOW);
			g.setFont(new Font("Sitka Heading",Font.BOLD,18));
			g.drawString(" Thank you so much For all your Hard Work and Support During the Difficulty ", 20, 500);
			g.drawString("  Time.Your humility ,Kindneess ,and strength are greatly appreciated . ", 24, 525);
			g.drawString("  Thank you For being ", 200, 550);
			g.setColor(Color.red);
			g.setFont(new Font("Sitka Heading",Font.BOLD,22));
			g.drawString("      Our Nation's guiding light  in the Face of adversity. ", 24, 575);
			g.setColor(Color.blue);
			g.setFont(new Font("Sitka Heading",Font.BOLD,35));
			g.drawString(" # STAY HOME. ", 175, 675);
			g.drawString(" # STAY SAFE. ", 175, 700);
	}




public static void main(String[] args) {
	new Banner();
}
}
