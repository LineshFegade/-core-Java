package patient_Info;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NewSearchBySpiaicalist extends JDialog{
	Container cp;
	Mains pref;
	JPanel p1;
	@SuppressWarnings("rawtypes")
	JComboBox chBox;
	JLabel lblSpailizations,lblDoctorName,lblRegNo,lblClinicAdd,lblCity,lblContactNo;
	JTextField txtSpailizations,txtDoctorName,txtRegNo,txtClinicAdd,txtCity,txtContactNo;
	JButton btnReset,btnClose;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NewSearchBySpiaicalist(Mains ref, String title, boolean b) {
		super(ref,title,b);
		pref=ref;
		cp=getContentPane();
		p1=new JPanel();
		p1.setLayout(new GridLayout(7,2,18,18));
		
		lblSpailizations=new JLabel("Spaicialization");
		lblSpailizations.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblSpailizations);
		chBox=new JComboBox();
		chBox.addItem("--Select--");
		chBox.addItem("Doctor of Audiology");
		chBox.addItem("Doctor of chiropractic");
		chBox.addItem("Doctor of Dental surger");
		chBox.addItem("Doctor of pharmacy");
		chBox.addItem("Doctor of medicine");
		chBox.addItem("master of Surgery");
		chBox.addItem("Doctor of nose and throat specialist");
		chBox.addItem("Doctor of science and physical Therapy ");
		p1.add(chBox);
		
		lblDoctorName=new JLabel("Doctor Name ");
		lblDoctorName.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblDoctorName);
		txtDoctorName=new JTextField();
		txtDoctorName.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtDoctorName);
		
		lblRegNo=new JLabel("Reg Number ");
		lblRegNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblRegNo);
		txtRegNo=new JTextField();
		txtRegNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtRegNo);
		
		lblClinicAdd=new JLabel("Client Address ");
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
		
		lblContactNo=new JLabel("Contact Number  ");
		lblContactNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblContactNo);
		txtContactNo=new JTextField();
		txtContactNo.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtContactNo);
		
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
					txtDoctorName.setText("");
					txtDoctorName.setText("");
					txtRegNo.setText("");;
					txtContactNo.setText("");
				}
			}
		});
		
		
		add(p1,"Center");
		setSize(700, 400);
		setVisible(true);
	}

}
