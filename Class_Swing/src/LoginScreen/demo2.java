package LoginScreen;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;
@SuppressWarnings({ "rawtypes", "serial" })
public class demo2 extends JFrame{
	Container cp;
	JButton btnClick,btnSearch;
	JLabel lbName;
	JTextField tfEmail;
	JPasswordField tfPass;
	JList lst;
	
	JComboBox cbSports;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2,rb3;
	
	@SuppressWarnings("unchecked")
	public demo2() {
		cp=getContentPane();
		cp.setLayout(new FlowLayout()); //places elements left to right manner 
		cp.setBackground(Color.CYAN);
		
		//Button
		btnClick=new JButton("Click");
		cp.add(btnClick);
		
	//	btnSearch=new JButton(new ImageIcon("search.jpg"));
		btnSearch=new JButton("Search");
		cp.add(btnSearch);
		
		//Label
		lbName=new JLabel("User Name");
		cp.add(lbName);
		
		//Textbox
		tfEmail=new JTextField(20);
		cp.add(tfEmail);
		
		//Password box		
		tfPass=new JPasswordField(20);
		cp.add(tfPass);
		
		//list
		Vector v=new Vector();
		v.add("Cricket");
		v.add("Basket Ball");
		v.add("Badminton");
		v.add("Chess");
		
		lst=new JList();
		lst.setListData(v); //we can elements to a list using a collection
		cp.add(lst);
		
		//drop down list
		cbSports=new JComboBox();
		cbSports.addItem("Cricket");
		cbSports.addItem("Basket Ball");
		cbSports.addItem("Badminton");
		cbSports.addItem("Chess");
		cp.add(cbSports);
		
		//checkbox
		cb1=new JCheckBox("Reading");
		cb2=new JCheckBox("TreKking");
		cb3=new JCheckBox("Music");
		cp.add(cb1);
		cp.add(cb2);
		cp.add(cb3);
		
		//radiobutton
		rb1=new JRadioButton("Reading");
		rb2=new JRadioButton("TreKking");
		rb3=new JRadioButton("Music");
		cp.add(rb1);
		cp.add(rb2);
		cp.add(rb3);
		
		//mutual exclusion-we can select only radiobutton
		ButtonGroup grp=new ButtonGroup();
		grp.add(rb1);
		grp.add(rb2);
		grp.add(rb3);
		
		
		
		setTitle("My Component Frame");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new demo2();
	}
}
