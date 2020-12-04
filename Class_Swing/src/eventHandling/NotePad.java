 package eventHandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class NotePad extends JFrame implements ActionListener,MouseListener{
	Container cp;
	JMenuBar mb;
	JTextArea ta;
	JMenu File,Edit,Format,Change,help;
	JMenuItem New,Open,Save,Exit,Cut,Copy,cut,copy,paste,Paste,ByColor,ForColor,Fonts,sunSet,floral,dayNight,ocean,AboutUs;
	JPopupMenu popMenu;
	JButton b1,b2,b3,b4,b5,b,b6,b7;
	JToolBar tb;
	

	public NotePad() {
		cp=getContentPane();
		ta=new JTextArea();
		ta.setFont(new Font("Arial",Font.BOLD,20));
		cp.add(ta);	
		
		//ToolBar.
		tb=new JToolBar();
		b1=new JButton(new ImageIcon("download.png"));
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				
			}
		});
		b2=new JButton(new ImageIcon("open.png"));
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();    
			    int i=fc.showOpenDialog(NotePad.this);  
				
			}
		});
		b3=new JButton(new ImageIcon("save.png"));
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int i=fc.showSaveDialog(NotePad.this);
			}
		});
		b4=new JButton(new ImageIcon("cut.png"));
		b5=new JButton(new ImageIcon("copy.png"));
		b6=new JButton(new ImageIcon("paste.png"));
		b7=new JButton(new ImageIcon("exit.jpg"));
		
		
		tb.setFloatable(true); 
		tb.add(b1);
		tb.addSeparator();
		tb.add(b2);
		tb.addSeparator();
		tb.add(b3);
		tb.addSeparator();
		tb.add(b4);
		tb.addSeparator();
		tb.add(b5);
		tb.addSeparator();
		tb.add(b6);
		tb.addSeparator();
		tb.add(b7);
		cp.add(tb,"North");
		
		//PopUp.
		sunSet=new JMenuItem("Sunset font");
		sunSet.setFont(new Font("Aeial", Font.ITALIC, 20));
		sunSet.addActionListener(this);
		
		floral=new JMenuItem("floral font");
		floral.setFont(new Font("Aeial", Font.ITALIC, 20));
		floral.addActionListener(this);
		
		dayNight=new JMenuItem("dayNight font");
		dayNight.setFont(new Font("Aeial", Font.ITALIC, 20));
		dayNight.addActionListener(this);
		
		ocean=new JMenuItem("ocean font");
		ocean.setFont(new Font("Aeial", Font.ITALIC, 20));
		ocean.addActionListener(this);
		
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("paste");
		cut.setFont(new Font("Aeial", Font.ITALIC, 20));
		copy.setFont(new Font("Aeial", Font.ITALIC, 20));
		paste.setFont(new Font("Aeial", Font.ITALIC, 20));
		cut.addActionListener(this);
		copy.addActionListener(this);
	    paste.addActionListener(this);
		
		
		popMenu=new JPopupMenu();
		popMenu.add(sunSet);
		popMenu.add(floral);
		popMenu.add(dayNight);
		popMenu.add(ocean);
		popMenu.add(cut);
		popMenu.add(copy);
		popMenu.add(paste);
		ta.addMouseListener(this);
		
		//File.
		mb=new JMenuBar();
		setJMenuBar(mb);
		File=new JMenu("File");
		File.setFont(new Font("Aeial", Font.ITALIC, 20));
		mb.add(File);
		
		New=new JMenuItem("NEW");
		New.setFont(new Font("Aeial", Font.ITALIC, 20));
		New.addActionListener(this);
		File.add(New);
		
		Open=new JMenuItem("OPEN"); 
		Open.setFont(new Font("Aeial", Font.ITALIC, 20));
		Open.addActionListener(this);
		File.add(Open);
		
		Save=new JMenuItem("SAVE");
		Save.setFont(new Font("Aeial", Font.ITALIC, 20)); 
		Save.addActionListener(this);
		File.add(Save);
		
		Exit=new JMenuItem("EXIT");
		Exit.setFont(new Font("Aeial", Font.ITALIC, 20));
		File.add(Exit);
		Exit.addActionListener(this);
		
		//Edit.
		Edit=new JMenu("EDIT");
		Edit.setFont(new Font("Aeial", Font.ITALIC, 20));
		mb.add(Edit);
		
		Cut=new JMenuItem("CUT");
		Cut.setFont(new Font("Aeial", Font.ITALIC, 20));
		Edit.add(Cut);
		Cut.addActionListener(this);
		
		Copy=new JMenuItem("COPY");
		Copy.setFont(new Font("Aeial", Font.ITALIC, 20));
		Edit.add(Copy);
		Copy.addActionListener(this);
		
		Paste=new JMenuItem("PASTE");
		Paste.setFont(new Font("Aeial", Font.ITALIC, 20));
		Edit.add(Paste);
		Paste.addActionListener(this);
		
		//Format.
		Format=new JMenu("FORMAT");
		Format.setFont(new Font("Aeial", Font.ITALIC, 20));
		mb.add(Format);
		
		Change=new JMenu("CHANGE");
		Change.setFont(new Font("Aeial", Font.ITALIC, 20));
		Format.add(Change);
		
		ByColor=new JMenuItem("BACKGROUND COLOR");
		ByColor.setFont(new Font("Aeial", Font.ITALIC, 20));
		Change.add(ByColor);
		ByColor.addActionListener(this);
		
		ForColor=new JMenuItem("FOREGROUND COLOR");
		ForColor.setFont(new Font("Aeial", Font.ITALIC, 20));
		Change.add(ForColor);
		ForColor.addActionListener(this);
		
		Fonts=new JMenuItem("FONTS");
		Fonts.setFont(new Font("Aeial", Font.ITALIC, 20));
		Change.add(Fonts);
		Fonts.addActionListener(this);
		
		//help.
		help=new JMenu("HELP");
		help.setFont(new Font("Aeial", Font.ITALIC, 20));
		mb.add(help);
		
		AboutUs=new JMenuItem("ABOUT US");
		AboutUs.setFont(new Font("Aeial", Font.ITALIC, 20));
		help.add(AboutUs);
		AboutUs.addActionListener(this);
		
		
		cp.add(new JScrollPane(ta));
		setSize(700,700);
		setTitle("NotePad");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		new NotePad();
		}
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Exit) {
			int r=JOptionPane.showConfirmDialog(this,"Are you sure you want to quit??","QUIT",
					JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			if(r==JOptionPane.YES_OPTION) {
				this.dispose(); 
			}
					
		}
		
		if(e.getSource()== New) {
			ta.setText("");
		}
		if(e.getSource()==Cut) {
			ta.cut();
		}
		if(e.getSource()==Copy) {
			ta.copy();
		}
		if(e.getSource()==Paste) {
			ta.paste();
		}
		if(e.getSource()==ByColor) {
			Color clr=JColorChooser.showDialog(this, "BackGround color", Color.lightGray);
			ta.setBackground(clr);
		}
		if(e.getSource()==ForColor) {
			Color clr=JColorChooser.showDialog(this, "Foreground color", Color.red);
			ta.setForeground(clr);
		}
		if(e.getSource()==Open) {
			JFileChooser fc=new JFileChooser();    
		    int i=fc.showOpenDialog(this);    
		}
		if(e.getSource()==Save) {
			JFileChooser fc=new JFileChooser();    
		    int i=fc.showSaveDialog(this);    
		}
		if(e.getSource()==sunSet) {
			ta.setBackground(new Color(255,150,0));
			ta.setForeground(Color.DARK_GRAY);
			ta.setFont(new Font("Calibri Italic",Font.ITALIC,25));
			
		}
		if(e.getSource()==floral) {
			ta.setBackground(new Color(169,169,169));
			ta.setForeground(Color.red);
			ta.setFont(new Font("Microsoft New Tai Lue bold",Font.ITALIC,30));
			
		}
		if(e.getSource()==dayNight) {
			ta.setBackground(new Color(248,247,237));
			ta.setForeground(Color.BLACK);
			ta.setFont(new Font("Times New Roman Italic",Font.BOLD,25));
			
		}
		if(e.getSource()==ocean) {
			ta.setBackground(new Color(15,212,203));
			ta.setForeground(Color.orange);
			ta.setFont(new Font("Candara Bold Italic",Font.ITALIC,35));
		}
		if(e.getSource()==cut) {
			ta.cut();
		}
		if(e.getSource()==copy) {
			ta.copy();
		}
		if(e.getSource()==paste) {
			ta.paste();
		}
		if(e.getSource()==AboutUs) {
			NotPadDilog dlg=new NotPadDilog(this,"About Us",false);
		}
		if(e.getSource()==Fonts) {  
			Fonts dl=new Fonts(this,"Fonts",false);
		}
		
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {
			popMenu.show(this,e.getX(),e.getY());
		}
		
	}


	
	
}
