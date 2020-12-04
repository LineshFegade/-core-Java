package ToolBar;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableDemo extends JFrame{
	 
	Container cp;
	JTable tb;
	
	public TableDemo() {
		cp=getContentPane();
		
		String[] colNames={"Employee Id","Emp Name","Joining Date","Salary"};
		TableModel model=new DefaultTableModel(colNames, 100);
		tb=new JTable(model);
		cp.add(new JScrollPane(tb));
		
		tb.setValueAt("101", 0, 0);
		tb.setValueAt("Rahul", 0, 1);
		tb.setValueAt("108",7,0);
		tb.setValueAt("Harshal", 7, 1);
		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TableDemo();
	}
}
