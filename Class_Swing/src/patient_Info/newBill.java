package patient_Info;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import eventHandling.NotePad;

@SuppressWarnings("serial")
public class newBill extends JDialog{
	Container cp;
    Mains pref;
    JPanel p1;
    JLabel lblBill,lblBillDate,lblPatientId,lblPatientName,lblAmount,lblMedicinesPrescribed;
    JTextField txtBill,txtBillDate,txtPatientId,txtPatientName,txtAmount,txtMedicinesPrescribed;
    JButton btnSave,btnReset;
    @SuppressWarnings("rawtypes")
	JComboBox dd,mm;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public newBill(Mains ref, String title, boolean b) {
		super(ref,title,b); 
		pref=ref;
		cp=getContentPane();
		p1=new JPanel();
		p1.setLayout(new GridLayout(8,2,15,15));
		
		lblBill=new JLabel("Bill Number");
		lblBill.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblBill);
		txtBill=new JTextField();
		txtBill.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(txtBill);
		
		lblBillDate=new JLabel("Bill Date");
		lblBillDate.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblBillDate);
		dd=new JComboBox();
		dd.addItem("--Date--");
		dd.addItem("1");dd.addItem("2");dd.addItem("3");dd.addItem("4");dd.addItem("5");dd.addItem("6");
		dd.addItem("7");dd.addItem("8");dd.addItem("9");dd.addItem("10");dd.addItem("11");dd.addItem("12");dd.addItem("13");
		dd.addItem("14");dd.addItem("15");dd.addItem("16");dd.addItem("17");dd.addItem("18");dd.addItem("19");
		dd.addItem("20");dd.addItem("21");dd.addItem("22");dd.addItem("23");dd.addItem("24");dd.addItem("25");
		dd.addItem("26");dd.addItem("27");dd.addItem("28");dd.addItem("29");dd.addItem("30");dd.addItem("31");
		p1.add(dd);
		
		mm=new JComboBox();
		mm.addItem("--Month--");
		mm.addItem("1");mm.addItem("2");mm.addItem("3");mm.addItem("4");mm.addItem("5");mm.addItem("6");
		mm.addItem("7");mm.addItem("8");mm.addItem("9");mm.addItem("10");mm.addItem("11");mm.addItem("12");
		p1.add(mm);
		
		txtBillDate=new JTextField();
		p1.add(txtBillDate);
		
		lblPatientId=new JLabel("Patient Id");
		lblPatientId.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblPatientId);
		txtPatientId=new JTextField();
		p1.add(txtPatientId);
		
		lblPatientName=new JLabel("Patient Name");
		lblPatientName.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblPatientName);
		txtPatientName=new JTextField();
		p1.add(txtPatientName);
		
		lblAmount=new JLabel("Bill Amount ");
		lblAmount.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblAmount);
		txtAmount=new JTextField();
		p1.add(txtAmount);
		
		lblMedicinesPrescribed=new JLabel("Medicines  Prescribed");
		lblMedicinesPrescribed.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(lblMedicinesPrescribed);
		txtMedicinesPrescribed=new JTextField();
		p1.add(txtMedicinesPrescribed);
		
		btnSave=new JButton("Save");
		p1.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				@SuppressWarnings("unused")
				int i=fc.showSaveDialog(newBill.this);
			}
		});
		btnReset=new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReset) {
					txtAmount.setText("");
					txtBill.setText("");
					txtBillDate.setText("");
					txtMedicinesPrescribed.setText("");
					txtPatientId.setText("");;
					txtPatientName .setText("");
				}
				
			}
		});
		p1.add(btnReset);
		add(p1,"Center");
		setSize(400, 350 );
		setVisible(true);
	}

}
