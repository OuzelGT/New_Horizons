
import java.awt.BorderLayout;
//import java.awt.PanelLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Passenger_Input_GUI  extends JFrame implements ActionListener

	{	
	
	//define colours
	Color  red  = new Color(255, 0, 0);
	Color  black = new Color(0, 0, 0);
	Color  blue = new Color(0, 0, 255);
	Color  Green = new Color(0, 255, 0);
	
//define fonts
	Font f0 = new Font("ARIAL", Font.ITALIC ,30);
	Font f1 = new Font("Monospaced", Font.BOLD ,25);
	Font f2 = new Font("ARIAL", Font.BOLD ,15);
	Font f3 = new Font("ARIAL", Font.BOLD ,25);
	
	
	//New Ticket Details Input Panel Items
	private JTextField first_name  ;
	private JTextField last_name;
	private JTextField age;
	private JTextField nationality;
	
	private JLabel destination, ticketType, ticketNumber, ticketPrice;
	

	
	
	JButton Button;
	
	
	private JButton myButton2;
	private JPanel detailsPanel,sidePanel,tp;
	private JPanel firstPanel;
	private JPanel pfirstPanel;

	Passenger_Store Passenger_Store = new Passenger_Store();
	//Tickets myTicket = new Tickets();
	Tickets myTicket;
	private Container cp;
	
	JLabel main_label = new JLabel(" ");
	
	private Destination_GUI dGUI;
	private Ticket_GUI tGUI;
	private Admin_GUI aGUI;
	private Passenger_Input_GUI pGUI;
	
	JFrame frame;
	
	
	public Passenger_Input_GUI ()
	{
		
		
		frame = new JFrame();
		frame.setTitle("Passenger GUI");
		
		cp = frame.getContentPane();
		cp.setLayout(new BorderLayout()); //set to border layout
		
		sidePanel =new JPanel(new GridLayout(1,2));
		sidePanel.setBackground(Color.gray);
		
		tp =new JPanel(new GridLayout(4,4));
		tp.setBackground(Color.gray);
		tp.setBorder(BorderFactory.createTitledBorder("Ticket Details"));

		
	
		detailsPanel =new JPanel();
		detailsPanel.setLayout(new FlowLayout());
		
		//outer panels
		firstPanel =new JPanel(new BorderLayout());
		
		
		//panels within panel
		
		pfirstPanel =new JPanel(new GridLayout(4,2));//(new GridLayout(4,4));
		pfirstPanel.setBackground(Color.red);
		pfirstPanel.setBorder(BorderFactory.createTitledBorder("Passenger Details"));
	
		
		//boxes
		Box b1a , b1b , b1c , b1d ;
		
		
		//Ticket Details Panel
		
				JLabel ticketTypeLabel = new JLabel("Ticket Type: "); //set label
				ticketTypeLabel.setFont(f3);
				ticketType = new JLabel("");             //matching programmable label
				ticketType.setFont(f3);
				ticketType.setForeground(Color.blue);
				
				JLabel ticketNumberLabel = new JLabel("Ticket Number: "); //set label
				ticketNumberLabel.setFont(f3);
				ticketNumber = new JLabel("0123456");			//matching programmable label
				ticketNumber.setFont(f3);
				ticketNumber.setForeground(Color.blue);
				
				JLabel ticketPriceLabel = new JLabel("Ticket Price: ");//set label
				ticketPriceLabel.setFont(f3);
				ticketPrice =  new JLabel("");				//matching programmable label
				ticketPrice.setFont(f3);
				ticketPrice.setForeground(Color.blue);
				
				JLabel destinationLabel = new JLabel("Destination: ");//set label
				destinationLabel.setFont(f3);
				destination =  new JLabel("");				//matching programmable label
				destination.setFont(f3);
				destination.setForeground(Color.blue);
				
				
				myButton2 = new JButton("Print Reciept");		
				myButton2.addActionListener(this);
				
				Button = new JButton("Confirm");
				Button.addActionListener(this);

				
				//add to Ticket Details Panel	
						tp.add(destinationLabel);
						tp.add(destination);
						
						tp.add(ticketTypeLabel);
						tp.add(ticketType);
						
						tp.add(ticketNumberLabel);
						tp.add(ticketNumber);
						
						tp.add(ticketPriceLabel);
						tp.add(ticketPrice);
		
		
		
		//passengerpanel 1
		
		
			JLabel first_nameLabel = new JLabel("First Name: ");
			first_name = new JTextField(20);
			first_nameLabel.setFont(f3);
		
			JLabel last_nameLabel = new JLabel("Last Name: ");
			last_name = new JTextField(20);
			last_nameLabel.setFont(f3);
		
			JLabel ageLabel = new JLabel("Pass. Age:");
			age = new JTextField(20);
			ageLabel.setFont(f3);
			
			JLabel nationalityLabel = new JLabel("Nationality: ");
			nationality = new JTextField(20);
			nationalityLabel.setFont(f3);
			
			b1a = new Box(BoxLayout.X_AXIS);
			b1b = new Box(BoxLayout.X_AXIS);
			b1c = new Box(BoxLayout.X_AXIS);
			b1d = new Box(BoxLayout.X_AXIS);
			
			
			
			
			//add to add to passenger panel1
			
			b1a.add(first_nameLabel);
			b1a.add(first_name);
			
			b1b.add(last_nameLabel);
			b1b.add(last_name);
			
			b1c.add(ageLabel);
			b1c.add(age);
			
			b1d.add(nationalityLabel);
			b1d.add(nationality);
			
			pfirstPanel.add(b1a);
			pfirstPanel.add(b1b);
			pfirstPanel.add(b1c);
			pfirstPanel.add(b1d);
		
		
		
				
		//add + arrange panels
				
				cp.add(sidePanel, BorderLayout.CENTER);
				
				sidePanel.add(tp);
				sidePanel.add(detailsPanel);//PASSENGER PANELS
				
				
		cp.add(Button, BorderLayout.SOUTH);
		
		detailsPanel.add(firstPanel);
		
		firstPanel.add(pfirstPanel,BorderLayout.CENTER);


		
		frame.setSize(800, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		frame.setVisible(false); //not immediately visible
		
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
		
		//recieve from combo boxes from previous screens
		public void setDestination(String dest) 
		{
			destination.setText(dest);
			
		}
		
		public void setTicketNumber(String number) 
		{
			
			ticketNumber.setText(number);
			
			
		}
		
		public void setTicketType(String type) 
		{
			ticketType.setText(type);
			//if (type == "Family")
			//{
			//	ticketType.setForeground(Color.pink);
			//}
		}
		
		public void setTicketPrice(String price) 
		{
			ticketPrice.setText(price.toString());
		}
		
	public void setVisible()
	{
		frame.setVisible(true); //make screen visible
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Button)
		{
			
			
			String theFirstName = first_name.getText();
			String theLastName = last_name.getText();
			int theAge = Integer.parseInt(age.getText());
			String theNationality = nationality.getText();
			String TheDestination = destination.getText();
			String TheTickType = ticketType.getText();
			int TheTickNum = Integer.parseInt(ticketNumber.getText());
			Double TheTickPrice = Double.parseDouble(ticketPrice.getText());
			String Input;
			
		//CONFIRMATION MESSAGE
			Input = JOptionPane.showInputDialog(null, "Confirm the following details are correct: \n"+
					"\n"+ "First Name: " +theFirstName +"\n"+ "Last Name: " +theLastName +"\n" +"Age:" + theAge + "\n"+ "Nationality: "+ theNationality+"\n" +
					"Destination: " +TheDestination +"\n" +"Ticket Type: "+ TheTickType + "\n"+ "Ticket Number: "+ TheTickNum+"\n" + "Price: "+TheTickPrice + "\n"+
					"(y/n)","Confirm",JOptionPane.WARNING_MESSAGE);
			
			if (Input.equals("y"))
			{
			Passenger myPassenger = new Passenger(theFirstName, theLastName, theAge, theNationality,TheDestination,TheTickType,TheTickNum,TheTickPrice);
			Passenger_Store.addPassenger(myPassenger);
			aGUI.addPassenger(theFirstName, theLastName, theAge, theNationality,TheDestination,TheTickType,TheTickNum,TheTickPrice);
			
				JOptionPane.showMessageDialog(frame, "Tickets Booked Successfully!"+ "\n" + "Return", "Skrrrt",JOptionPane.INFORMATION_MESSAGE);
				frame.setVisible(false);//make this screen invisible
				dGUI.setVisible();
			}
			
				}
			else
			JOptionPane.showMessageDialog(frame, "Operation Aborted", "Aborted",JOptionPane.INFORMATION_MESSAGE);
		}
		

	}

