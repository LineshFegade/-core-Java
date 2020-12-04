package layout;
import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class Calculator extends JFrame{
	Container cp;
	JTextField txt1,txt2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	JPanel p1,p2;
	public Calculator() {
		cp=getContentPane();
		cp.setLayout(new BorderLayout(10,10));
		p2=new JPanel();
		p2.setLayout(new BorderLayout(10,10));
		
		  txt1=new JTextField(); 
		  p2.add(txt1,"Center");
		 
		
		
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(4,6));
		
		b1=new JButton("OFF");
		p1.add(b1);
		b2=new JButton("MC");
		p1.add(b2);
		b3=new JButton("MR");
		p1.add(b3);
		b4=new JButton("CLR");
		p1.add(b4);
		b5=new JButton("^");
		p1.add(b5);
		b6=new JButton("ON");
		p1.add(b6);
		b7=new JButton("0");
		p1.add(b7);
		b8=new JButton("1");
		p1.add(b8);
		b9=new JButton("2");
		p1.add(b9);
		b10=new JButton("3");
		p1.add(b10);
		b11=new JButton("4");
		p1.add(b11);
		b12=new JButton("5");
		p1.add(b12);
		b13=new JButton("6");
		p1.add(b13);
		b14=new JButton("7");
		p1.add(b14);
		b15=new JButton("8");
		p1.add(b15);
		b16=new JButton("9");
		p1.add(b16);
		b17=new JButton("=");
		p1.add(b17);
		b18=new JButton("+");
		p1.add(b18);
		b19=new JButton("-");
		p1.add(b19);
		b20=new JButton("*");
		p1.add(b20);
		b21=new JButton("/");
		p1.add(b21);
		b22=new JButton("1/2");
		p1.add(b22);
		b23=new JButton(".");
		p1.add(b23);
		b24=new JButton("%");
		p1.add(b24);
		
		cp.add(p2, "Center");
		cp.add(p1, "South");
		
		setSize(500,500);
		setTitle("Calculator");
		cp.setBackground((Color.CYAN));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		new Calculator();
}
}
