package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class NotPadDilog extends JDialog implements ActionListener{
	Container cp;
	NotePad pref;
	JPanel panel1,panel2,panel3;
	JLabel lbl1,lbl2,lblFontNme,lblSize,jLabel1;
	JButton btnCancel;
	
	public NotPadDilog(NotePad ref,String title,boolean b) {
		 
		
		panel1=new JPanel();
		panel1.setLayout(new BorderLayout(10,10) );
		lbl1=new JLabel("This Application Devloped By Linesh.");
		lbl1.setFont(new Font("Candara Bold Italic",Font.ITALIC,30));
		panel1.add(lbl1);
		panel1.setBackground(Color.cyan);
		add(panel1,"Center");
		
		panel2=new JPanel();	
		btnCancel=new JButton("Cancel");
		btnCancel.addActionListener(this);
		panel2.add(btnCancel);
		panel2.setBackground(Color.cyan);
		add(panel2,"South");
		
		//pending put image.
		
		  panel3=new JPanel();
		  jLabel1=new JLabel();
		  jLabel1.setIcon(new ImageIcon("iconf.png")) ;
		  panel3.add(jLabel1); 
		  panel3.setBackground(Color.cyan);
		  add(panel3,"North");
		 
		
		setSize(500, 300);
		setVisible(true);
		
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCancel) {
			System.exit(0);
		}
		
	}
}
