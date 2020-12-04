package layout;
import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class SimpleIntrestCalculator extends JFrame{
	Container cp;
	JLabel lblPrinciple,lblYear,lblRate,lblIntrest,lblSimple;
	JTextField txtPrinciple,txtYear,txtRate,txtIntrest,txtSimple;
	JButton btnCalculate,btnReset;
	public SimpleIntrestCalculator() {
		cp=getContentPane();
		cp.setLayout(new GridLayout(5,2,50,50));
		lblPrinciple=new JLabel("Principle Amount ");
		lblPrinciple.setFont(new Font("Arial",Font.BOLD,25));
		
		txtPrinciple=new JTextField();
		cp.add(lblPrinciple);
		cp.add(txtPrinciple);
		
		lblYear=new JLabel("No of Year ");
		lblYear.setFont(new Font("Arial",Font.BOLD,25));
		txtYear=new JTextField();
		cp.add(lblYear);
		cp.add(txtYear);
		
		lblRate=new JLabel("Rate ");
		lblRate.setFont(new Font("Arial",Font.BOLD,25));
		
		txtRate=new JTextField();
		cp.add(lblRate);
		cp.add(txtRate);
		
		btnCalculate=new JButton("Calculate");
		cp.add(btnCalculate);
		
		btnReset=new JButton("Reset");
		cp.add(btnReset);
		
		
		lblSimple=new JLabel("Simple Intrest ");
		lblSimple.setFont(new Font("Arial",Font.BOLD,25));
		
		cp.add(lblSimple);
		txtSimple=new JTextField();
		cp.add(txtSimple);
	
		
		setSize(600,600);
		setTitle("Simple Interset Calculator");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
public static void main(String[] args) {
	new SimpleIntrestCalculator();
}
}
