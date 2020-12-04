package eventHandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
@SuppressWarnings("serial")
public class ChangingBackrounds extends JFrame implements ActionListener,ItemListener,ListSelectionListener{
	
	Container cp;
	JRadioButton rRed,rGreen,rBlue;
	@SuppressWarnings("rawtypes")
	JComboBox chBox;
	JPanel p1;
	@SuppressWarnings("rawtypes")
	JList lst;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ChangingBackrounds() {
		cp=getContentPane();
		cp.setLayout(new BorderLayout(10,10));
		//cp.setBackground(Color.cyan);
		cp.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		
		
		rRed=new JRadioButton("RED");
		rGreen=new JRadioButton("GREEN");
		rBlue=new JRadioButton("BLUE");  
			
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,1,20,20));
		p1.add(rRed);
		p1.add(rGreen);
		p1.add(rBlue);
		cp.add(p1, "Center");
		ButtonGroup grp=new ButtonGroup();
		grp.add(rRed);
		grp.add(rBlue);
		grp.add(rGreen);
		rRed.addActionListener(this);
		rBlue.addActionListener(this);
		rGreen.addActionListener(this);
		
		//Drop box.
		chBox=new JComboBox();
		chBox.addItem("--colors--");
		chBox.addItem("RED");
		chBox.addItem("GREEN");
		chBox.addItem("ORANGE");
		chBox.addItem("BLUE");
		chBox.addItem("WHITE");
		chBox.addItem("BLACK");
		chBox.addItem("CYAN");
		chBox.addItem("GRAY");
		cp.add(chBox);
		chBox.addItemListener(this);
	
		//ListBox.
		Vector vc=new Vector();
		vc.add("Black");
		vc.add("magenta");
		vc.add("orange");
		vc.add("darkgray");
	
		lst=new JList();
		lst.setListData(vc); //we can elements to a list using a collection
		cp.add(lst);
		lst.addListSelectionListener(this);
		
		setSize(300, 300);
		setTitle("CHANGING BACKGROUND");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new ChangingBackrounds();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==rRed) {
		cp.setBackground(Color.RED);
	}
	if(e.getSource()==rGreen) {
		cp.setBackground(Color.GREEN);
	}
	if(e.getSource()==rBlue) {
		cp.setBackground(Color.BLUE);
	}
}
@Override
public void itemStateChanged(ItemEvent e) {
	if(e.getSource()==chBox) {
		String str=chBox.getSelectedItem().toString();
		if(str.equals("RED"))
		cp.setBackground(Color.RED);
		else if(str.equals("GREEN")) {
			cp.setBackground(Color.green);
		}
		else if(str.equals("BLUE")) {
			cp.setBackground(Color.BLUE);
		}
		else if(str.equals("BLACK")) {
			cp.setBackground(Color.black);
		}
		else if(str.equals("ORANGE")) {
			cp.setBackground(Color.ORANGE);
		}
		else if(str.equals("WHITE")) {
			cp.setBackground(Color.WHITE);
		}
		else if(str.equals("CYAN")) {
			cp.setBackground(Color.CYAN);
		}
		else if(str.equals("GRAY")) {
			cp.setBackground(Color.GRAY);
		}
			
	}
	
	
}
@Override
public void valueChanged(ListSelectionEvent e) {
	if(e.getSource()==lst) {
		String str=lst.getSelectedValue().toString();
		if(str.equals("Black")) {
			cp.setBackground(Color.black);
		}
		else if(str.equals("magenta")) {
			cp.setBackground(Color.MAGENTA);
		}
		else if(str.equals("orange")) {
			cp.setBackground(Color.orange);
		}
		else if(str.equals("darkgray")) {
			cp.setBackground(Color.DARK_GRAY);
		}
	}
	
}
}
