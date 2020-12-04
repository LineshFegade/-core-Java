package patient_Info;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import ToolBar.MyPanel;
public class NewPatient extends JDialog{
	Container cp;
	Mains pref;
	JSplitPane sp;
	JPanel p1;
	JButton btnSave,btnReset;
	public NewPatient(Mains ref, String title, boolean b) {
		super(ref,title,b); 
		pref=ref;
		cp=getContentPane();
		p1=new JPanel();
		p1.add(new PersonalInfo());
		sp.setRightComponent(p1);
		sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		sp.setLeftComponent(new HelthInfo());
		
		btnSave=new JButton("Save");
		cp.add(btnSave);
		
		btnReset=new JButton("Reset");
		cp.add(btnReset);
		cp.add(sp);
		
		
		
		
		
		setSize(500, 350 );
		setVisible(true);
	}

}
