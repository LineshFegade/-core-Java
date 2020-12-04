 package patient_Info;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings({ "serial", "unused" })
public class SearchPatient extends JDialog {
	Container cp;
	Mains pref;
	JLabel pId,pName,pContact,pAddress;
	JTextField txtId,txtName,txtContact,txtAddress;

	public SearchPatient(Mains ref, String title, boolean b) {
		super(ref,title,b); 
		pref=ref;
		cp=getContentPane();
		cp.setLayout(new GridLayout(4, 2));
		
		pId=new JLabel("Patient Id");
		pId.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(pId);
		txtId= new JTextField();
		txtId.setForeground(Color.blue);
		txtId.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(txtId);
		
		pName=new JLabel("Patient Name");
		pName.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(pName);
		txtName= new JTextField();
		txtName.setForeground(Color.blue);
		txtName.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(txtName);
		
		pContact=new JLabel("Patient Contact Number ");
		pContact.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(pContact);
		txtContact= new JTextField();
		txtContact.setForeground(Color.blue);
		txtContact.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(txtContact);
		
		pAddress=new JLabel("Patient Address ");
		pAddress.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(pAddress);
		txtAddress= new JTextField();
		txtAddress.setForeground(Color.blue);
		txtAddress.setFont(new Font("Aeial", Font.ITALIC, 20));
		cp.add(txtAddress);
		
		setSize(500, 300);
		setVisible(true);
	}

}
