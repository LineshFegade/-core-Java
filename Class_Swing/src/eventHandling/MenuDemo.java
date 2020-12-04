package eventHandling; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class MenuDemo extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu option,New;
	JMenuItem exit,change,c,cpp,java;
	Container cp;
	
	public MenuDemo(){
		cp=getContentPane();
		
		mb=new JMenuBar();
		setJMenuBar(mb);
		//option menu
		option=new JMenu("Option");
		mb.add(option);
		
		
		//submenu
		New=new JMenu("New");
		option.add(New);
		
		c=new JMenuItem("C");
		cpp=new JMenuItem("CPP");
	    java=new JMenuItem("Java");
	    
	    New.add(c);
	    New.add(cpp);
	    New.add(java);
		
		
		change=new JMenuItem("Change");
		option.add(change);
		change.addActionListener(this);
		
		exit=new JMenuItem("Exit");
		option.add(exit);
		exit.addActionListener(this);
		
		
		
		setLocation(250, 100);
		setSize(500, 500);	
		setTitle("My Swing Frame");		
		setVisible(true);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==change){
			Color clr=JColorChooser.showDialog(this, "My Color box", Color.red);
			cp.setBackground(clr);
			
		}
		
		if(e.getSource()==exit){
			int r=JOptionPane.showConfirmDialog(this,"Are you sure you want to quit??","QUIT",
					JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
			if(r==JOptionPane.YES_OPTION)
				this.dispose(); //closes the frame
		}
		
	}
}
