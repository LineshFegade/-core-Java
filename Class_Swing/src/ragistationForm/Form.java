package ragistationForm;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;
@SuppressWarnings({ "rawtypes", "serial" })
public class Form extends JFrame{
	Container cp; 
	JLabel lblName,lblAddress,lblCity,lblRefrance,lblKnow;
	JTextField tfMAil,txtAddress;
	JLabel jrBtn;
	JComboBox chBox;
	JCheckBox bc,Java,Cpp,net,testing,python;
	JButton btnRegistation,btnReset;
	
	JRadioButton jrBtn1,jrBtn2;
	JList lst;
	@SuppressWarnings("unchecked")
	public Form(){
		cp=getContentPane();
		cp.setLayout(null); //for dimensions.
	
		//Full Name label.
		lblName=new JLabel("Full Name");
		cp.add(lblName);
		lblName.setBounds(50,25,100,30);
		cp.add(lblName);
		lblName.setFont(new Font("Arial",Font.BOLD,20));
		lblName.setForeground(Color.red);
		tfMAil=new JTextField(50);                            //user name TEXTFild.
		cp.add(tfMAil);
		tfMAil.setBounds(250,25,400,30);
		cp.add(tfMAil);
		
		//Gender.
		jrBtn=new JLabel("Gender");
		jrBtn.setFont(new Font("Arial",Font.BOLD,20));
		jrBtn.setForeground(Color.red);
		jrBtn1=new JRadioButton("Male");
		jrBtn2=new JRadioButton("Female");
		jrBtn1.setFont(new Font("Arial",Font.BOLD,20));
		jrBtn2.setFont(new Font("Arial",Font.BOLD,20));
		
		cp.add(jrBtn);
		cp.add(jrBtn1);
		cp.add(jrBtn2);
		jrBtn.setBounds(50,85,100,30);
		jrBtn1.setBounds(250,85,100,30);
		jrBtn2.setBounds(400,85,100,30);
		//mutual exclusion-we can select only radiobutton
		ButtonGroup grp=new ButtonGroup();
		grp.add(jrBtn1);
		grp.add(jrBtn2);
		
		//Address.
		lblAddress=new JLabel("Address");
		lblAddress.setFont(new Font("Arial",Font.BOLD,20));
		lblAddress.setForeground(Color.red);
		lblAddress.setBounds(50,150,100,30);
		cp.add(lblAddress);
		txtAddress=new JTextField(2000);  //Text field
		txtAddress.setBounds(250,150,400,40);
		cp.add(txtAddress);
		
		//City.
		lblCity=new JLabel("City");
		lblCity.setFont(new Font("Arial",Font.BOLD,20));
		lblCity.setForeground(Color.red);
		lblCity.setBounds(50,225,100,30);
		cp.add(lblCity);
		
		chBox=new JComboBox();
		chBox.addItem("City");
		chBox.addItem("Mumbai");
		chBox.addItem("Pune");
		chBox.addItem("Nagpur");
		chBox.addItem("Solapur");
		chBox.addItem("Kolkata");
		chBox.addItem("Banglore");
		chBox.addItem("Hydrabad");
		chBox.addItem("Channai");
		cp.add(chBox);
		chBox.setBounds(250,225,200,30);
		
		//Refrance.
		lblRefrance=new JLabel("Refrance");
		lblRefrance.setFont(new Font("Arial",Font.BOLD,20));
		lblRefrance.setForeground(Color.red);
		lblRefrance.setBounds(50,300,100,30);
		cp.add(lblRefrance);
		
		Vector vc=new Vector();
		vc.add("Newspaper");
		vc.add("Facebook");
		vc.add("whats app");
		vc.add("Friends");
		vc.add("TV");
		
		lst=new JList();
		lst.setListData(vc); //we can elements to a list using a collection
		cp.add(lst);
		lst.setBounds(250,300,73,90);
		
		
		//chose
		lblKnow=new JLabel("Technology You Want " );
		lblKnow.setBounds(275,425,900,30);
		lblKnow.setFont(new Font("Arial",Font.BOLD,20));
		lblKnow.setForeground(Color.red);
		
		bc=new JCheckBox("C");
		bc.setBounds(100,475,100,30);
		bc.setFont(new Font("Arial",Font.BOLD,20));
		
		Cpp=new JCheckBox("C++");
		Cpp.setBounds(200,475,100,30);
		Cpp.setFont(new Font("Arial",Font.BOLD,20));
		
		Java=new JCheckBox("Java");
		Java.setBounds(300,475,100,30);
		Java.setFont(new Font("Arial",Font.BOLD,20));
		
		net=new JCheckBox(".Net");
		net.setBounds(400,475,100,30);
		net.setFont(new Font("Arial",Font.BOLD,20));
		
		testing=new JCheckBox("Testing");
		testing.setBounds(500,475,100,30);
		testing.setFont(new Font("Arial",Font.BOLD,20));
		
		python=new JCheckBox("python");
		python.setBounds(600,475,100,30);
		python.setFont(new Font("Arial",Font.BOLD,20));
		cp.add(lblKnow);
		cp.add(bc);
		cp.add(Cpp);
		cp.add(Java);
		cp.add(net);
		cp.add(testing);
		cp.add(python);
		
		
		//Buttons.
		btnRegistation=new JButton("Registration");
		btnRegistation.setBounds(150,600,130,30);
		cp.add(btnRegistation);
		
		
		btnReset=new JButton("Reset");
		btnReset.setBounds(350,600,130,30);
		cp.add(btnReset);
		
		
			
		setTitle("Registration Form");
		setSize(500, 500);	
		cp.setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}	
public static void main(String[] args) {
      @SuppressWarnings("unused")
	Form s= new Form();
}
}
