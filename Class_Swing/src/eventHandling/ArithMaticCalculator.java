package eventHandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class ArithMaticCalculator extends JFrame implements ActionListener{
	Container cp;
	JLabel lblFirstNo,lblSecondNo,lblResult;
	JTextField txtFirstNo,txtSecondNo,txtResult;
	JPanel panel1,panel2,panel3;
	JRadioButton rAdd,rSub,rMul,rDiv;
	JButton btnCalculate,btnReset;
	public ArithMaticCalculator() {
		cp=getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		cp.setLayout(new BorderLayout(20,20));
		
		panel1=new JPanel();							//panel one.
		panel1.setBackground(Color.YELLOW);
		panel1.setLayout(new GridLayout(3,2,30,30));
		lblFirstNo=new JLabel("First Number");
			lblFirstNo.setForeground(Color.RED);
			lblFirstNo.setFont(new Font("Arial",Font.BOLD,25));
		panel1.add(lblFirstNo);
		txtFirstNo=new JTextField(10);
		txtFirstNo.setSize(200, 30);
		txtFirstNo.setForeground(Color.blue);
		panel1.add(txtFirstNo);
		
		lblSecondNo=new JLabel("Seocnd Number");
		panel1.add(lblSecondNo);
		lblSecondNo.setForeground(Color.RED);
		lblSecondNo.setFont(new Font("Arial",Font.BOLD,25));
		txtSecondNo=new JTextField(10);
		txtSecondNo.setSize(200, 30);
		txtSecondNo.setForeground(Color.blue);
		panel1.add(txtSecondNo);
		add(panel1,"North");
		
		
		
		
		
		panel2=new JPanel();								//panel second
		panel2.setBackground(Color.YELLOW);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		rAdd=new JRadioButton("Addition");
		rAdd.setFont(new Font("Arial",Font.BOLD,25));
		panel2.add(rAdd);
		rSub=new JRadioButton("Subtraction");
		rSub.setFont(new Font("Arial",Font.BOLD,25));
		panel2.add(rSub);
		rMul=new JRadioButton("Multiplication");
		rMul.setFont(new Font("Arial",Font.BOLD,25));
		panel2.add(rMul);
		rDiv=new JRadioButton("Division");
		rDiv.setFont(new Font("Arial",Font.BOLD,25));
		panel2.add(rDiv);
		ButtonGroup grp=new ButtonGroup();
			grp.add(rSub);
			grp.add(rAdd);
			grp.add(rDiv);
			grp.add(rMul);
			add(panel2,"Center");
			
			
		panel3=new JPanel();								//panel third.
		panel3.setBackground(Color.YELLOW);
		panel3.setLayout(new GridLayout(2,4,50,50));
		lblResult=new JLabel("Result");
		lblResult.setForeground(Color.RED);
		panel3.add(lblResult);
		lblResult.setFont(new Font("Arial",Font.BOLD,25));
		txtResult=new JTextField(10);
		txtResult.setForeground(Color.RED);
		txtResult.setSize(200, 30);
		  
		
		panel3.add(txtResult);
		
		btnCalculate=new JButton("Calculate");
		panel3.add(btnCalculate);
		btnReset=new JButton("Reset");
		panel3.add(btnReset);
		btnCalculate.addActionListener(this);
		btnReset.addActionListener(this);
		
		
		add(panel3,"South");
		setSize(300, 300);
		setTitle("Arithmatic opration");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(Color.YELLOW);
	}
public static void main(String[] args) {
	new ArithMaticCalculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(rAdd.isSelected()) {
		
			if(e.getSource()==btnCalculate) {
				float num1=Float.parseFloat(txtFirstNo.getText());
				float num2=Float.parseFloat(txtSecondNo.getText());
				float num3=num1+num2;
				txtResult.setText(""+num3);
			}
	}
			
		 if(rSub.isSelected()) {
			if(e.getSource()==btnCalculate) {
				float n1=Float.parseFloat(txtFirstNo.getText());
				float n2=Float.parseFloat(txtSecondNo.getText());
				float n3=n1-n2;
				txtResult.setText(""+n3);
			}
		}
		 if(rMul.isSelected()) {
			 if(e.getSource()==btnCalculate) {
					float num1=Float.parseFloat(txtFirstNo.getText());
					float num2=Float.parseFloat(txtSecondNo.getText());
					float num3=num1*num2;
					txtResult.setText(""+num3);
				}
		 }
		 
		 if(rDiv.isSelected()) {
			 if(e.getSource()==btnCalculate) {
					float num1=Float.parseFloat(txtFirstNo.getText());
					float num2=Float.parseFloat(txtSecondNo.getText());
					float num3=num1/num2;
					txtResult.setText(""+num3);
				}
		 }
		 if(e.getSource()==btnReset) {
			 txtFirstNo.setText("");
			 txtSecondNo.setText("");
			 txtResult.setText("");
			 
		 }
	
	
}
}
