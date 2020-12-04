 package patient_Info;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Mains extends JFrame implements ActionListener{
	Container cp;
	JTextArea ta;
	JMenu doctor,patient,report,help;
	JMenuItem New,search,Exit,Dnew,byNameSearch,bySpacialistSearch,bill,monthly,yearly,aboutUs;
	JMenuBar mb;
	public Mains() {
		cp=getContentPane();
		ta=new JTextArea();
		cp.add(ta);
		////////////////////////////////patient///////////////////////////////////////
		mb=new JMenuBar();
		setJMenuBar(mb);
		patient=new JMenu("Patient");
		patient.setFont(new Font("Aeial",Font.ITALIC,15));
		patient.addSeparator();
		mb.add(patient);
		
		New=new JMenuItem("NEW");
		New.setFont(new Font("Aeial",Font.ITALIC,15));
		New.addActionListener(this);
		patient.add(New);		
		
		search=new JMenuItem("SEARCH");
		search.setFont(new Font("Aeial",Font.ITALIC,15));
		patient.add(search);
		search.addActionListener(this);
		Exit=new JMenuItem("EXIT");
		Exit.setFont(new Font("Aeial",Font.ITALIC,15));
		patient.add(Exit);
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Exit) {
					int r=JOptionPane.showConfirmDialog(Mains.this,"Are you sure you want to quit??","QUIT",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
					if(r==JOptionPane.YES_OPTION) {
						this.dispose(); 
					}			
				}
			}

			private void dispose() {
				System.exit(0);
				
			}
		});
		
		//////////////////////////////DOCTOR.//////////////////////////////////////////////////
		doctor=new JMenu("Doctor");
		doctor.setFont(new Font("Aeial",Font.ITALIC,15));
		doctor.addSeparator();
		mb.add(doctor);
		
		Dnew=new JMenuItem("NEW");
		Dnew.setFont(new Font("Aeial",Font.ITALIC,15));
		Dnew.addActionListener(this);
		doctor.add(Dnew);		
		byNameSearch=new JMenuItem("SEARCH BY NAME ");
		byNameSearch.setFont(new Font("Aeial",Font.ITALIC,15));
		byNameSearch.addActionListener(this);
		doctor.add(byNameSearch);
		
		bySpacialistSearch=new JMenuItem("SERCH BY SPECIALIST");
		bySpacialistSearch.setFont(new Font("Aeial",Font.ITALIC,15));
		bySpacialistSearch.addActionListener(this);
		doctor.add(bySpacialistSearch);
		
		/////////////////////////////REPORTS.///////////////////////////////////////
		report=new JMenu("Reports");
		report.setFont(new Font("Aeial",Font.ITALIC,15));
		report.addSeparator();
		mb.add(report);
		
		bill=new JMenuItem("BILLS");
		bill.setFont(new Font("Aeial",Font.ITALIC,15));
		bill.addActionListener(this);
		report.add(bill);		
		
		monthly=new JMenuItem("MONTHLY REPORTS");
		monthly.setFont(new Font("Aeial",Font.ITALIC,15));
		monthly.addActionListener(this);
		report.add(monthly);
		
		yearly=new JMenuItem("YEARLY REPORTS");
		yearly.setFont(new Font("Aeial",Font.ITALIC,15));
		yearly.addActionListener(this);
		report.add(yearly);
		
		//////////////////////////////////ABOUT US////////////////////////////////////
		help=new JMenu("Help");
		help.setFont(new Font("Aeial",Font.ITALIC,15));
		help.addSeparator();
		mb.add(help);

		aboutUs=new JMenuItem("ABOUT US");
		aboutUs.setFont(new Font("Aeial",Font.ITALIC,15));
		help.add(aboutUs);
		
		setVisible(true);
		cp.add(new JScrollPane(ta));
		setSize(700,700);
		setTitle("Patient Information ");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public static void main(String[] args) {
	new Mains();
}

@SuppressWarnings("unused")
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==search) { 
		SearchPatient s=new SearchPatient(this, "SEARCH", false);
	}
	if(e.getSource()==New) {
		NewPatient n=new NewPatient(this,"new Patient",false);
	}
	if(e.getSource()==Dnew) {
		NewDoctor d=new NewDoctor(this,"New Doctor",false);
	}
	if(e.getSource()==byNameSearch) {
		NewSearchByName s=new NewSearchByName(this, "Search Doctor By Name", false);
	}
	if(e.getSource()==bySpacialistSearch) {
		NewSearchBySpiaicalist s=new NewSearchBySpiaicalist(this, "Search By Spaicilist ", false);
	}
	if(e.getSource()==bill) {
		newBill b=new newBill(this,"Bill",false);
	}
	if(e.getSource()==monthly) {
		newMonthly m=new newMonthly(this,"Monthly Report ",false);
	}
	if(e.getSource()==yearly) {
		newYearly y=new newYearly(this,"Yearly Report ",false);
	}
}
}
