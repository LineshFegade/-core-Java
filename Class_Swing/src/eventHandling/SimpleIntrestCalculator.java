package eventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class SimpleIntrestCalculator extends JFrame implements ActionListener{
	 Container cp;
	 JLabel lblPrinciple,lblYear,lblRate,lblIntrest,lblSimple;
	JTextField txtPrinciple,txtYear,txtRate,txtIntrest,txtSimple;
	JButton btnCalculate,btnReset;
	public SimpleIntrestCalculator(){
		cp=getContentPane();
		cp.setLayout(new BorderLayout(10,10));
		cp.setBackground(Color.cyan);
		cp.setLayout(new GridLayout(5,2,50,50));
		
		lblPrinciple=new JLabel("Principle Amount ");
		lblPrinciple.setFont(new Font("Arial",Font.BOLD,25));
		txtPrinciple=new JTextField();
		txtPrinciple.setFont(new Font("Arial",Font.BOLD,25));
		txtPrinciple.setForeground(Color.blue);
		cp.add(lblPrinciple);
		cp.add(txtPrinciple);
		
		lblYear=new JLabel("No of Year ");
		lblYear.setFont(new Font("Arial",Font.BOLD,25));
		txtYear=new JTextField();
		txtYear.setFont(new Font("Arial",Font.BOLD,25));
		txtYear.setForeground(Color.blue);
		cp.add(lblYear);
		cp.add(txtYear);
		
		lblRate=new JLabel("Rate ");
		lblRate.setFont(new Font("Arial",Font.BOLD,25));
		
		txtRate=new JTextField();
		txtRate.setFont(new Font("Arial",Font.BOLD,25));
		txtRate.setForeground(Color.blue);
		cp.add(lblRate);
		cp.add(txtRate);
		
		btnCalculate=new JButton("Calculate");
		cp.add(btnCalculate);
		btnCalculate.addActionListener(this);
		
		btnReset=new JButton("Reset");
		cp.add(btnReset);
		btnReset.addActionListener(this);
		
		
		lblSimple=new JLabel("Simple Intrest ");
		lblSimple.setFont(new Font("Arial",Font.BOLD,25));
		
		cp.add(lblSimple);
		txtSimple=new JTextField();
		txtSimple.setFont(new Font("Arial",Font.BOLD,25));
		txtSimple.setForeground(Color.RED);
		cp.add(txtSimple);
	
		
		setSize(600,600);
		setTitle("Simple Interset Calculator");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
	new SimpleIntrestCalculator(); }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCalculate) {
		int ans1=Integer.parseInt(txtPrinciple.getText());
		int ans2=Integer.parseInt(txtYear.getText());
		int ans3=Integer.parseInt(txtRate.getText());
		int ans4=ans1*(1+ans3*ans2);
		txtSimple.setText(""+ans4);
		}
		if(e.getSource()==btnReset) {
			txtPrinciple.setText("");
			txtRate.setText("");
			txtSimple.setText("");
			txtYear.setText("");
		}
	}

}
