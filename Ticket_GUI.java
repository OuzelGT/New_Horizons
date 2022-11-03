import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Ticket_GUI extends JFrame implements ActionListener{
	
	Passenger_Store Passenger_Store;

	
	//define colours
			Color  red  = new Color(255, 0, 0);
			Color  black = new Color(0, 0, 0);
			Color  blue = new Color(0, 0, 255);
			Color  Green = new Color(0, 255, 0);
			
	//define fonts
			Font f0 = new Font("ARIAL", Font.ITALIC ,30);
			Font f1 = new Font("Monospaced", Font.BOLD ,15);
			Font f2 = new Font("ARIAL", Font.BOLD ,15);
			
		//DEFINE IMAGES	
			ImageIcon icon0 = new ImageIcon("images\\choosetickets.jpg");
			ImageIcon icon1 = new ImageIcon("images\\single.jpg");
			ImageIcon icon2 = new ImageIcon("images\\family.jpg");
			ImageIcon icon3 = new ImageIcon("images\\VIP.jpg");
			
		//	
			private JPanel p0,p1,p2;
			private JLabel l0,l1, ImageLabel;
			private JTextField PassField;
			private JButton b1, LogButton;
			private JComboBox<String> TicketType;
	
			private JFrame frame;
	
			private Container cp;
			
			CardLayout CLadmin;
			JPanel CJPoff;
			JPanel Login_Screen;
			
			String destination; //for storing value from first screen
			
			private Destination_GUI dGUI;
			private Ticket_GUI tGUI;
			private Admin_GUI aGUI;
			private Passenger_Input_GUI pGUI;

	
	public Ticket_GUI(){
		
	//Set up the background
		
		setTitle("Tickets!");	
		setLayout(new FlowLayout());
		setBackground(Color.YELLOW);
		cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.setBackground(Color.GREEN);
		
				
				
		
		
		p0=new JPanel(); //main panel
		p0.setBackground(Color.BLACK);
		p0.setLayout(new BorderLayout());
		p1=new JPanel(); //inner panel
		p1.setBackground(Color.BLUE);
		p2=new JPanel(); //nothr panel
		
		
		// create Admin Login Panel
		JPanel Login_Screen = new JPanel();
		Login_Screen.setBackground(Color.yellow);
		JLabel Login_Code = new JLabel("Login using this code \"1234\"");
		Login_Screen.add(Login_Code);
		
		Login_Screen = new JPanel(new BorderLayout());
		Login_Screen.setBackground(Color.yellow);
		

		

		JPanel LogPanel = new JPanel();
		LogPanel.setBackground(Color.yellow);
		JLabel lLogin_Code = new JLabel("Login using this code \"1234\"");
		LogPanel.add(lLogin_Code);
		
		JPanel PassPanel = new JPanel();
		
		PassField = new JTextField(15);
		PassField.addActionListener(this);
		PassPanel.add(PassField);
		PassPanel.setBackground(Color.yellow);

		
		LogButton = new JButton("LOGIN");
		LogButton.addActionListener(this);

		
		Login_Screen.add(LogPanel, BorderLayout.NORTH);
		Login_Screen.add(PassPanel, BorderLayout.CENTER);
		Login_Screen.add(LogButton, BorderLayout.SOUTH);
		
		
		
		//jtf1=new JTextField("0",10);
		b1=new JButton("Choose Ticket");
		b1.addActionListener(this);  //read from button clicks
		
		
		
		//customize heading
		l0 = new JLabel("Tickets!");
		l0.setFont(f0);  
		l0.setBorder(BorderFactory.createRaisedBevelBorder());
		//l0.setOpaque(true);
		l0.setBackground(Color.BLACK);
		l0.setForeground(Color.blue);
		//customize subheading
		l1 = new JLabel("Please Select your Ticket Type!");
		l1.setFont(f1);  
		l1.setBorder(BorderFactory.createRaisedBevelBorder());
		//l0.setOpaque(true);
		l1.setBackground(Color.BLACK);
		l1.setForeground(Color.yellow);
		
		ImageLabel = new JLabel();//where to load the image
		ImageLabel.setIcon(icon0); // set default image
		
		
		TicketType = new JComboBox<String>();
		TicketType.addItem("[Make Selection]");
		TicketType.addItem("Single");
		TicketType.addItem("Family");
		TicketType.addItem("VIP");
		TicketType.addActionListener(this);
		
		Box bx0 = new Box(BoxLayout.Y_AXIS); //create boxes for grouping
		Box bx1 = new Box(BoxLayout.Y_AXIS);
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("BOOKING", p0); 
		jtp.addTab("ADMIN", Login_Screen);  
		 
		
	
		cp.add(jtp, BorderLayout.CENTER);
		
		//cp.add(p0);  //add da content 2 da pane innit
		
		bx0.add(l0);
		bx0.add(l1);
		bx1.add(TicketType);
		bx1.add(ImageLabel);
		p0.add(bx0, BorderLayout.NORTH);
		p0.add(p1, BorderLayout.CENTER);
		p0.add(p2, BorderLayout.SOUTH);
		p1.add(bx1);
		p2.add(b1);
		
		
		
		
		
		
		
		// frame
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(false);
			
	}
	
	public void setVisible() //for setting screen visibility
	{
		setVisible(true);
	}
	
	   //PASS INFO BETWEEN SCREENS:
	public void pass_dGUI(Destination_GUI myDgui)
	{
		dGUI = myDgui;
	}
	public void pass_pGUI(Passenger_Input_GUI myPgui)
	{
		pGUI = myPgui;
	}
	public void pass_tGUI(Ticket_GUI myTgui)
	{
		tGUI = myTgui;
	}
	public void pass_aGUI(Admin_GUI myAgui)
	{
		aGUI = myAgui;
	}
	
	//recieve selection from combo box from previous screen
			public void setDestination(String msg) 
			{
				destination =msg;
			}
	
	
public void actionPerformed(ActionEvent e) 
{
	
	if(e.getSource()== TicketType)
	{	
		if (TicketType.getSelectedItem()== "[Make Selection]")
		{
			ImageLabel.setIcon(icon0);
		}
		
		if (TicketType.getSelectedItem()== "Single")
		{
			ImageLabel.setIcon(icon1);
		}
		
		if (TicketType.getSelectedItem()== "Family")
		{
			ImageLabel.setIcon(icon2);
		}
		
		if (TicketType.getSelectedItem()== "VIP")
		{
			ImageLabel.setIcon(icon3);
		}
		
		
		
	}
	
	
	if(e.getSource()== b1)
	{	
		if (TicketType.getSelectedItem()== "[Make Selection]")
		{  /// message
			JOptionPane.showMessageDialog(frame, "Please Select a Ticket type!", "No Selection",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			//new variables to transfer data to new object [myTicket]
			String TheDestination = destination;
			String TheTickType = TicketType.getSelectedItem().toString();
			//new object containing the values for the destination and ticket type
			Tickets myTicket = new Tickets(TheDestination, TheTickType);
		
		setVisible(false);//make this screen invisible
		//Passenger_Input_GUI myPgui = new Passenger_Input_GUI(); //open new window to Passenger detail input screen
		pGUI.setVisible(); //make next screen visible
		
		pGUI.setDestination(myTicket.getDestination() );//transfer combobox selections to next screen
		pGUI.setTicketType(myTicket.getType());
		pGUI.setTicketPrice(myTicket.getPrice().toString());
		pGUI.setTicketNumber(myTicket.getTickNo());
		}
	}
	
	if (e.getSource() == LogButton)
	{
		if (PassField.getText().equals("1234"))
		{
			setVisible(false);
			Admin_GUI myAgui = new Admin_GUI();
			aGUI.setVisible(true);
		}
	}
	
}
	
	
	
}




