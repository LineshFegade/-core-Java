package LoginScreen;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class demo extends JFrame {
   Container cp;
	
	public demo(){
		cp=getContentPane();		
		cp.setBackground(new Color(50,200,220));
		
		setSize(500, 300);	
		setTitle("My Swing Frame");
		//setBackground(Color.YELLOW);
		setVisible(true);
		//The application must terminate as soon as the frame is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		demo f=new demo();
		
	}
}
