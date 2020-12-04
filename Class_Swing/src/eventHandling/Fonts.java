package eventHandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Fonts extends JDialog implements ActionListener{
		Container cp;
		NotePad prefs;
		JTextArea ta;
		JTextField fontSize;
		JLabel lblFontsNAme,lblFontsSize;
		@SuppressWarnings("rawtypes")
		JComboBox fontName;
		JButton btnApply,btnCancel;
		
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Fonts(NotePad ref, String title, boolean a) {
		super(ref,title,a); 
		prefs=ref;
		cp=getContentPane();
		cp.setLayout(null);
		//cp.setFont(new Font());

		lblFontsNAme=new JLabel("Font Name");
		lblFontsNAme.setBounds(35,25,100,30);
		lblFontsNAme.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(lblFontsNAme);
		
		
		lblFontsSize=new JLabel("Font Size");
		lblFontsSize.setBounds(320,25,100,30);
		lblFontsSize.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(lblFontsSize);
	
		
		fontName=new JComboBox();
		fontName.addItem("--Select Font--");
		fontName.addItem("Charlesworth");
		fontName.addItem("Arial Black");
		fontName.addItem("Comic Sans MS");
		fontName.addItem("CG Omega");
		fontName.addItem("Verdana");
		fontName.addItem("Courier New");
		fontName.addItem("Albertus Extra Bold");
		fontName.setBounds(20,50,200,30);
		cp.add(fontName);
		fontName.addActionListener(this);
		
		fontSize=new JTextField();
		fontSize.setBounds(290,50,200,30);
		cp.add(fontSize);
		fontSize.addActionListener(this);
		
		btnApply=new JButton("Apply");
		cp.add(btnApply);
		btnApply.setBounds(80,180,100,40);
		btnApply.addActionListener(this);
		
		btnCancel=new JButton("Cancel");
		cp.add(btnCancel);
		btnCancel.setBounds(300,180,100,40);
		btnCancel.addActionListener(this);
		
		setSize(500, 300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnApply) {
			String str=(String) fontName.getSelectedItem().toString();
			int sizes=Integer.parseInt(fontSize.getText());
			prefs.ta.setFont(new Font(str,Font.PLAIN,sizes));
		
			
		}
		if(e.getSource()==btnCancel) {
			int r=JOptionPane.showConfirmDialog(this,"Are you sure you want to quit??","QUIT",
					JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			if(r==JOptionPane.YES_OPTION) {
				this.dispose();
		}
		
		
	}

	}
	
}

