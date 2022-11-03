import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Destination_GUI extends JFrame implements ActionListener{
	
	//define colours
			Color  red  = new Color(255, 0, 0);
			Color  black = new Color(0, 0, 0);
			Color  blue = new Color(0, 0, 255);
			Color  Green = new Color(0, 255, 0);
			
	//define fonts
			Font f0 = new Font("ARIAL", Font.ITALIC ,30);
			Font f1 = new Font("Monospaced", Font.BOLD ,15);
			Font f2 = new Font("ARIAL", Font.BOLD ,15);
			
			ImageIcon icon = new ImageIcon("images\\stars.jpg");
			ImageIcon icon0 = new ImageIcon("images\\choose.jpg");
			ImageIcon icon1 = new ImageIcon("images\\mars.jpg");
			ImageIcon icon2 = new ImageIcon("images\\newearth.jpg");
			ImageIcon icon3 = new ImageIcon("images\\moon.jpg");
			ImageIcon icon4 = new ImageIcon("images\\spacestation.jpg");
			
			private JPanel p0,p1,p2,p3;
			private JLabel l0,l1, ImageLabel;
			private JTextField PassField;
			private JButton b1, LogButton;
			private JComboBox<String> Destinations;
	
			//JFrame frame;
			private JFrame frame1;
	
			private Container cp;
			
			
			JPanel Login_Screen;
			JLabel warning;
			JPanel LogPanel;
			
			private Destination_GUI dGUI;
			private Ticket_GUI tGUI;
			private Admin_GUI aGUI;
			private Passenger_Input_GUI pGUI;

	
	public Destination_GUI(){
		
	//Set up the background
		//frame = new JFrame();
		setTitle("New Horizons");	
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
		p3=new JPanel(); //nothr panel
		
		Box bx0 = new Box(BoxLayout.Y_AXIS); //create boxes for grouping
		Box bx1 = new Box(BoxLayout.Y_AXIS);
		Box bxAdmin = new Box(BoxLayout.Y_AXIS);
		Box bxSelect = new Box(BoxLayout.Y_AXIS);
		
		// create Admin Login Panel
		JPanel Login_Screen = new JPanel();
		Login_Screen.setBackground(Color.yellow);
		JLabel Login_Code = new JLabel("Login using this code \"1234\"");
		Login_Screen.add(Login_Code);
		
		Login_Screen = new JPanel(new BorderLayout());
		Login_Screen.setBackground(Color.ORANGE);
		
		LogPanel = new JPanel();
		LogPanel.setBackground(Color.yellow);
		JLabel lLogin_Code = new JLabel("Please Enter Administrator Password!");
		LogPanel.add(lLogin_Code);
		
		JPanel PassPanel = new JPanel();
		warning = new JLabel("");
		warning.setForeground(Color.black);
		
		PassField = new JPasswordField(15);
		PassField.addActionListener(this);
		PassPanel.add(bxAdmin);
		bxAdmin.add(PassField);
		bxAdmin.add(warning);
		PassPanel.setBackground(Color.gray);

		LogButton = new JButton("LOGIN");
		LogButton.addActionListener(this);

		Login_Screen.add(LogPanel, BorderLayout.NORTH);
		Login_Screen.add(PassPanel, BorderLayout.CENTER);
		Login_Screen.add(LogButton, BorderLayout.SOUTH);
		//end of admin log screen
		
		
		b1=new JButton("Choose Destination");
		b1.addActionListener(this);  //read from button clicks
		
	
		
		//customize heading
		l0 = new JLabel("Welcome to New Horizons!");
		l0.setFont(f0);  
		l0.setBorder(BorderFactory.createRaisedBevelBorder());
		l0.setBackground(Color.BLACK);
		l0.setForeground(Color.blue);
		//customize subheading
		l1 = new JLabel("Choose your Destination!");
		l1.setFont(f2);  
		l1.setBorder(BorderFactory.createRaisedBevelBorder());
		l1.setBackground(Color.BLACK);
		l1.setForeground(Color.yellow);
		
		ImageLabel = new JLabel();
		ImageLabel.setIcon(icon0);
		
		
		Destinations=new JComboBox<String>();
		Destinations.addItem("DESTINATIONS");
		Destinations.addItem("Mars");
		Destinations.addItem("Moon Mines");
		Destinations.addItem("New Earth");
		Destinations.addItem("Space Station");
		Destinations.addActionListener(this);
		
		
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("BOOKING", p0); 
		jtp.addTab("ADMIN", Login_Screen);  
		 
		
	
		cp.add(jtp, BorderLayout.CENTER);
		
		//cp.add(p0);  //add da content 2 da pane innit
		
		bx0.add(l0);
		bx0.add(l1);
		bx1.add(Destinations);
		bx1.add(ImageLabel);
		p0.add(bx0, BorderLayout.NORTH);
		p0.add(p1, BorderLayout.CENTER);
		p0.add(p2, BorderLayout.SOUTH);
		p1.add(bx1);
		p2.add(b1);
		p0.add(p3, BorderLayout.WEST);
		
		
		
		
		// frame
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);  //first screen is immediately visible
			
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
	
	//-----------make screen visible
	public void setVisible()
	{
		setVisible(true); 
	}
	
	
	//for user interactions
public void actionPerformed(ActionEvent e) 
{
	
	if(e.getSource()== Destinations)  //change the image displayed based on selected option
	{	
		if (Destinations.getSelectedItem()== "DESTINATIONS")
		{
			ImageLabel.setIcon(icon0);
			
		}
		
		if (Destinations.getSelectedItem()== "Mars")
		{
			ImageLabel.setIcon(icon1);
			
		}
		
		if (Destinations.getSelectedItem()== "New Earth")
		{
			ImageLabel.setIcon(icon2);
		}
		
		if (Destinations.getSelectedItem()== "Moon Mines")
		{
			ImageLabel.setIcon(icon3);
		}
		
		if (Destinations.getSelectedItem()== "Space Station")
		{
			ImageLabel.setIcon(icon4);
		}
		
	}
	
	
	if(e.getSource()== b1)  //if selection not made of invalid selection give error
	{	
		//warning message
		if (Destinations.getSelectedItem()== "DESTINATIONS")
		{
			JOptionPane.showMessageDialog(frame1, "Please Select a Destination", "Not Selected",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else 
		{//transfer combobox selection to a later screen
		
		setVisible(false);//make this screen invisible
		//Ticket_GUI myTgui = new Ticket_GUI(); //open new window to ticket screen
		tGUI.setVisible(); //make next screen visible
		String destination = Destinations.getSelectedItem().toString(); //save combobox selection to string
		tGUI.setDestination(destination); //bring the selection to next screen
		}
	}
	
	if (e.getSource() == LogButton)
	{
		if (PassField.getText().equals("1234"))
		{
			setVisible(false);
			//Admin_GUI myAgui = new Admin_GUI();
			aGUI.setVisible();
		}
		else
		{
			LogPanel.setBackground(Color.red);
			warning.setText("Warning: Password Incorrect!");
			PassField.setText("");
		}
	}
	
	
}


}