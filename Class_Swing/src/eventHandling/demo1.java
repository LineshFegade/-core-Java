package eventHandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class demo1 extends JFrame implements ActionListener,MouseListener,ItemListener{
	Container cp;
	JButton btnRed,btnBlue,btnGreen;
	@SuppressWarnings("rawtypes")
	JComboBox cb;
	
	public demo1() {
		cp=getContentPane();
		
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		btnRed=new JButton("Red");
		cp.add(btnRed);
		btnRed.addActionListener(this);
		
		btnBlue=new JButton("Blue");
		cp.add(btnBlue);
		btnBlue.addActionListener(this);
		
		btnGreen=new JButton("Green");
		cp.add(btnGreen);
		btnGreen.addMouseListener(this);
	
		//combobox
		cb=new JComboBox();
		cb.addItem("--select--");
		cb.addItem("black");
		cb.addItem("orange");
		cb.addItem("magenta");
		cp.add(cb);
		cb.addItemListener(this);
		
		
		
		setSize(300, 300);
		setTitle("color");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
public static void main(String[] args) {
	new demo1();
}
@Override//Its a list operation.
public void itemStateChanged(ItemEvent e) {
	if(e.getSource()==cb){
		String clr=cb.getSelectedItem().toString();
		if(clr.equals("black"))
			cp.setBackground(Color.black);
		else if(clr.equals("orange"))
			cp.setBackground(Color.orange);
		else if(clr.equals("magenta"))
			cp.setBackground(Color.MAGENTA);
		
		
	}
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	btnGreen.setBackground(Color.GREEN);
	
}
@Override
public void mouseExited(MouseEvent e ) {
	// TODO Auto-generated method stub
	btnGreen.setBackground(Color.GRAY);
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnRed)
		cp.setBackground(Color.red);
	if(e.getSource()==btnBlue)
		cp.setBackground(Color.blue);

	
}
}
