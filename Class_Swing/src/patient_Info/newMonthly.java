package patient_Info;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class newMonthly extends JDialog{
	Container cp;
    Mains pref;
    JPanel p1,p2;
    JLabel month;
    JComboBox cmonth;
    JTable tb;
    JButton btnsearch;
	@SuppressWarnings("unchecked")
	public newMonthly(Mains ref, String title, boolean b) {
		super(ref,title,b); 
		pref=ref;
		cp=getContentPane();
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,3,10,10));
		month=new JLabel("month");
		month.setFont(new Font("Aeial", Font.ITALIC, 20));
		p1.add(month);
		
		cmonth=new JComboBox();
		cmonth.addItem("--month--");
		cmonth.addItem("Jan");
		cmonth.addItem("Feb");
		cmonth.addItem("Mar");
		cmonth.addItem("Apr");
		cmonth.addItem("May");
		cmonth.addItem("Jun");
		cmonth.addItem("Jul");
		cmonth.addItem("Aug");
		cmonth.addItem("Sep");
		cmonth.addItem("Aug");cmonth.addItem("Nov");cmonth.addItem("Des");
		p1.add(cmonth);
		
		btnsearch=new JButton("Search");
		p1.add(btnsearch);
		add(p1,"North");
		
		p2=new JPanel();
		p2.setLayout(new GridLayout());
		String[] colNames={"Months","Billing Amount","Number of Patients"};
		TableModel model=new DefaultTableModel(colNames, 100);
		tb=new JTable(model);
		p2.add(new JScrollPane(tb));
		add(p2,"Center");
		
		
		
		
		setSize(500, 350 );
		setVisible(true);
	}

}
