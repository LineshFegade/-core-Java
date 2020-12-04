package layout;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class ProductApp extends JFrame{
	Container cp;
	JLabel lblCode,lblName,lblPrise;
	JTextField txtCode,txtName,txtPrise;
	JPanel p1,p2;
	JButton btnSave,btnLoad,btnUpdate,btnDelete,btnReset;
	public ProductApp() {
		cp=getContentPane();
		cp.setLayout(new BorderLayout(20,20));
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(3,2,20,20));
		lblCode=new JLabel("Product code");
		p2.add(lblCode);
		txtCode=new JTextField(20);
		txtCode.setSize(200,10);
		p2.add(txtCode);
		
		lblName=new JLabel("Product Name");
		p2.add(lblName);
		txtName=new JTextField(20);
		txtName.setSize(200,10);
		p2.add(txtName);
		
		lblPrise=new JLabel("Prise");
		p2.add(lblPrise);
		txtPrise=new JTextField(20);
		txtPrise.setSize(200,10);
		p2.add(txtPrise);
		
		
		
		
		p1=new JPanel();
		p1.setLayout(new FlowLayout());
		btnSave=new JButton("Save");
		btnLoad=new JButton("Load");
		btnUpdate=new JButton("Update");
		btnDelete=new JButton("Delete");
		btnReset=new JButton("Reset");
		
		p1.add(btnSave);
		p1.add(btnLoad);
		p1.add(btnUpdate);
		p1.add(btnDelete);
		p1.add(btnReset);
		
		add(p2,"North");
		add(p1,"South");
		
		setSize(500,500);
		setTitle("Product App");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
public static void main(String[] args) {
	ProductApp p=new ProductApp();
}
}
