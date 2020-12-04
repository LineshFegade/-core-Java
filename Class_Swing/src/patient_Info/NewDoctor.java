package patient_Info;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class NewDoctor extends JDialog {
	Container cp;
    Mains pref;
	JLabel lblRegNO,lblDname,lblAdd,lblSpaicalizagion,lblContact,lblCity;
	JTextField txtRegNo,txtDname,txtAdd,txtContact;
	JPanel p1,p2;
	JButton btnSave,btnReset;
	@SuppressWarnings("rawtypes")
	JComboBox Spaicalization,City;
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public NewDoctor(Mains ref, String title, boolean b) {
		super(ref,title,b); 
		pref=ref;
		cp=getContentPane();
		p1=new JPanel();
		p1.setLayout(new GridLayout(7, 2,15,15));
		
		lblRegNO=new JLabel("Registation No ");
		lblRegNO.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblRegNO);
		txtRegNo =new JTextField();
		txtRegNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtRegNo);
		
		lblDname=new JLabel("Doctor Name ");
		lblDname.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblDname);
		txtDname=new JTextField();
		txtDname.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtDname);
		
		
		lblSpaicalizagion=new JLabel("Spaicalization ");
		lblSpaicalizagion.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblSpaicalizagion);
		Spaicalization=new JComboBox();
		Spaicalization.addItem("--Select--");
		Spaicalization.addItem("Doctor of Audiology");
		Spaicalization.addItem("Doctor of chiropractic");
		Spaicalization.addItem("Doctor of Dental surger");
		Spaicalization.addItem("Doctor of pharmacy");
		Spaicalization.addItem("Doctor of medicine");
		Spaicalization.addItem("master of Surgery");
		Spaicalization.addItem("Doctor of nose and throat specialist");
		Spaicalization.addItem("Doctor of science and physical Therapy ");
		p1.add(Spaicalization);
		
		lblContact=new JLabel("Contact Number");
		lblContact.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblContact);
		txtContact=new JTextField();
		txtContact.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtContact);
		
		lblAdd=new JLabel("Clinic Address ");
		lblAdd.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblAdd);
		txtAdd=new JTextField();
		txtAdd.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtAdd);
		
		lblCity=new JLabel("City ");
		lblCity.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblCity);
		City=new JComboBox();
		City.addItem("--Select--");
		City.addItem("Mumbai");
		City.addItem("pune");
		City.addItem("Hydrabad");
		City.addItem("Nashik");
		City.addItem("panvel");
		City.addItem("jalgoan");
		City.addItem("nagpur");
		City.addItem("indor");
		p1.add(City);
		
		btnSave=new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSave) {
					JFileChooser fc=new JFileChooser();    
				    @SuppressWarnings("unused")
					int i=fc.showSaveDialog(NewDoctor.this);    
				}
				
			}
		});
		p1.add(btnSave);
		btnReset=new JButton("Reset");
		p1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReset) {
					txtAdd.setText("");
					txtContact.setText("");
					txtDname.setText("");
					txtRegNo.setText("");
				}
			}
		});
		add(p1,"Center");
		setSize(400, 350 );
		setVisible(true);
	}

}
