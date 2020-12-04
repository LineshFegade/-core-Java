package patient_Info;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class NewSearchByName extends JDialog{
	Container cp;
	Mains pref;
	JPanel p1;
	JLabel lblregNo,lblDoctorName,lblSpaicalization,lblContact,lblClinicAdd,lblCity;
	JTextField txtregNo,txtDoctorName,txtSpaicalization,txtContact,txtClinicAdd,txtCity;
	JButton btnReset,btnClose;
	public NewSearchByName(Mains ref, String title, boolean b) {
		super(ref,title,b);
		pref=ref;
		cp=getContentPane();
		p1=new JPanel();
		p1.setLayout(new GridLayout(7, 2,20,20));
		
		lblregNo=new JLabel("Registation No ");
		lblregNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblregNo);
		txtregNo=new JTextField();
		txtregNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtregNo);
		
		lblDoctorName=new JLabel("Doctor Name");
		lblDoctorName.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblDoctorName);
		txtDoctorName=new JTextField();
		txtDoctorName.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtDoctorName);
		
		lblSpaicalization=new JLabel("Spaicalization");
		lblSpaicalization.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblSpaicalization);
		txtSpaicalization=new JTextField();
		txtSpaicalization.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtSpaicalization);
		
		lblContact=new JLabel("Contact Number ");
		lblContact.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblContact);
		txtContact=new JTextField();
		txtContact.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtContact);
		
		lblClinicAdd=new JLabel("Clinic Address ");
		lblClinicAdd.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblClinicAdd);
		txtClinicAdd=new JTextField();
		txtClinicAdd.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtClinicAdd);
		
		lblCity=new JLabel("City");
		lblCity.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblCity);
		txtCity=new JTextField();
		txtCity.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtCity);
		
		btnClose=new JButton("Close");
		p1.add(btnClose);

		btnReset=new JButton("Reset");
		p1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReset) {
					txtCity.setText("");
					txtClinicAdd.setText("");
					txtContact.setText("");
					txtDoctorName.setText("");
					txtregNo.setText("");;
					txtSpaicalization.setText("");
				}
			}
		});
		
		add(p1,"Center");	
		setSize(750, 500);
		setVisible(true);
	}
}
