import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
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





public class Admin_GUI extends JFrame implements ActionListener{
	
	JFrame frame;
	
	Container cp;
	int MemCount;
	
	//table stuff
	DefaultTableModel model;
	JTable Database;
	JScrollPane scroll;
	
	JPanel pTable ,pDetails, pButtons;
	//text fields
	JTextField jtf0;
	JTextField jtf1; 
	JTextField jtf2; 
	JTextField jtf3;
	JTextField jtf4;
	JTextField jtf5;
	JTextField jtf6;
	JTextField jtf7;
	
	
	JButton addButton; JButton removeButton;
	
	
	
	JComboBox<String> members;
	
	private Destination_GUI dGUI;
	private Ticket_GUI tGUI;
	private Passenger_Input_GUI pGUI;
	
	
	
public Admin_GUI(){
	
	
		
		//frame = new JFrame();
		setTitle("Administration");
		
		cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		
		//TABLE:   
				model = new DefaultTableModel(); 
				Database = new JTable(model);
				Database.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
				scroll = new JScrollPane(Database);
			//  	Create the columns 
				model.addColumn("First Name:"); 
				model.addColumn("Last Name:");
				model.addColumn("Age:");
				model.addColumn("Nationality");
				model.addColumn("Destination");
				model.addColumn("Ticket Type:");
				model.addColumn("Ticket No.:");
				model.addColumn("Ticket Price:");
				// Append a row 
				model.addRow(new Object[]{"Liam", "Ousley", "99","E.Europa","New Earth","VIP","84449","00.00"});
				model.addRow(new Object[]{"Joe", "Bloggs", "35","Martian","Mars","Single","84023","2000.00"});
				model.addRow(new Object[]{"Skeeter", "Gibbs", "22","E.Texas","New Earth","Single","84046","200000.00"});
				model.addRow(new Object[]{"Dennis", "McGovern", "34","Europa","New Earth","Family","84009","180000.00"});
				model.addRow(new Object[]{"Evonne", "McGovern", "31","Europa","New Earth","Family","84010","180000.00"});
				model.addRow(new Object[]{"Marcus", "McGovern", "10","Europa","New Earth","Family","84011","60000.00"});
				model.addRow(new Object[]{"Michelle", "McGovern", "6","Europa","New Earth","Family","84012","60000.00"});
				model.addRow(new Object[]{"Peabody", "Hambulam", "54","E.Texas","Moon Mines","Single","84254","1000.00"});
				model.addRow(new Object[]{"Jiminy", "Crickett", "26","E.Texas","Moon Mines","Single","84667","1000.00"});
				model.addRow(new Object[]{"Vlad", "Dracul", "26","E.Romania","Moon Mines","Single","84056","1000.00"});
				model.addRow(new Object[]{"Volodimir", "Zimbabwe", "26","E.Romania","Moon Mines","Single","83998","1000.00"});
				model.addRow(new Object[]{"Jahova", "Barohka", "175","Martian","Mars","VIP","84023","5000.00"});
			
				
		
				
		
		
		//-----------------ADD PANELS------------------------------
		
		
		pTable= new JPanel(new GridLayout(1,1)); 
		pTable.setBackground(Color.black);
		
		pDetails = new JPanel(new GridLayout(2,8)); 
		pDetails.setBackground(Color.green);
		pDetails.setBorder(BorderFactory.createTitledBorder("Add Members"));
		
		pButtons = new JPanel(new GridLayout(1,2));
		pButtons.setBackground(Color.red);
		
		
		 Box box = new Box(BoxLayout.Y_AXIS);
		
	
		
		
		
		JLabel l0 = new JLabel("First Name: ");
		JLabel l1 = new JLabel("Last Name: ");
		JLabel l2 = new JLabel("Age: ");
		JLabel l3 = new JLabel("Nationality: ");
		JLabel l4 = new JLabel("Destination: ");
		JLabel l5 = new JLabel("Ticket Type: ");
		JLabel l6 = new JLabel("Ticket No.: ");
		JLabel l7 = new JLabel("Ticket Price: ");
		
		
		jtf0 = new JTextField(20);
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jtf3 = new JTextField(20); 
		jtf4 = new JTextField(20);
		jtf5 = new JTextField(20);
		jtf6 = new JTextField(20);
		jtf7 = new JTextField(20); 
		 
		
		
		

		
//-----------------combo---------------------------------		
		members = new JComboBox<String>();
		members.addItem("Null");
		members.addActionListener(this);
		
		
		

//MANUALLY ADD OR REMOVE***************************************************
	addButton = new JButton("Add Passenger");
	addButton.addActionListener(this);			
				
	removeButton = new JButton("Remove Passenger");
	removeButton.addActionListener(this);
		
	
	//----COMBINE PANELS & ADD to Frame-
		
	pTable.add(scroll);

	pDetails.add(l0);
	pDetails.add(l1);
	pDetails.add(l2);
	pDetails.add(l3);
	pDetails.add(l4);
	pDetails.add(l5);
	pDetails.add(l6);
	pDetails.add(l7);
	
	pDetails.add(jtf0);
	pDetails.add(jtf1);
	pDetails.add(jtf2);
	pDetails.add(jtf3);
	pDetails.add(jtf4);
	pDetails.add(jtf5);
	pDetails.add(jtf6);
	pDetails.add(jtf7);
		
		
	pButtons.add(addButton);
	pButtons.add(removeButton);
	
		cp.add(pTable, BorderLayout.NORTH);
		cp.add(pDetails, BorderLayout.CENTER);
		cp.add(pButtons, BorderLayout.SOUTH);
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false); //this screen not immediately visible
		

}

public void setVisible() //for setting screen visibility
{
	setVisible(true);
}


public void addPassenger (String theFirstName,String theLastName,int theAge,String theNationality,String TheDestination,String TheTickType,int TheTickNum,Double TheTickPrice)//(Passenger p)
{
	model.addRow(new Object[]{theFirstName, theLastName, theAge, theNationality,TheDestination,TheTickType,TheTickNum,TheTickPrice});
	
}
public void removePassenger(int Row)
{
	System.out.println("Row = " + Row);
	model.removeRow(Row);
}


public void actionPerformed(ActionEvent e) {
	 
	
	if(e.getSource()== addButton)
	{
		String theFirstName = jtf0.getText();
		String theLastName = jtf1.getText();
		int theAge = Integer.parseInt(jtf2.getText());
		String theNationality = jtf3.getText();
		String TheDestination = jtf4.getText();
		String TheTickType = jtf5.getText();
		int TheTickNum = Integer.parseInt(jtf6.getText());
		Double TheTickPrice = Double.parseDouble(jtf7.getText());
		String Input;
		Input = JOptionPane.showInputDialog(null, "Confirm the following details are correct: \n"+
				"\n"+ "First Name: " +theFirstName +"\n"+ "Last Name: " +theLastName +"\n" +"Age:" + theAge + "\n"+ "Nationality: "+ theNationality+"\n" +
				"Destination: " +TheDestination +"\n" +"Ticket Type: "+ TheTickType + "\n"+ "Ticket Number: "+ TheTickNum+"\n" + "Price: "+TheTickPrice + "\n"+
				"(y/n)","Confirm",JOptionPane.WARNING_MESSAGE);
		
		
		if (Input.equals("y"))
		{
			Passenger myPassenger = new Passenger(theFirstName, theLastName, theAge, theNationality,TheDestination,TheTickType,TheTickNum,TheTickPrice);
			pGUI.Passenger_Store.addPassenger(myPassenger);
			
		
		JOptionPane.showMessageDialog(frame, "Operation Completed", "Member Added",JOptionPane.INFORMATION_MESSAGE);
		model.addRow(new Object[]{theFirstName, theLastName, theAge, theNationality,TheDestination,TheTickType,TheTickNum,TheTickPrice});
		
		}
		else
			JOptionPane.showMessageDialog(frame, "Operation Aborted", "Aborted",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	if(e.getSource()== removeButton)
	{
		
		
			
			if(Database.getSelectedRow() != -1)
			{
				String Input;
				Input = JOptionPane.showInputDialog(null, "Are you sure you would like to remove "+Database.getSelectedRow()+"?"+"\n"+"\n" + "(y/n)","Select",JOptionPane.WARNING_MESSAGE);
				
				if (Input.equals("y"))
				{
				
				
				model.removeRow(Database.getSelectedRow());
				
			}

			
		JOptionPane.showMessageDialog(frame, "Operation Completed", "Member Removed",JOptionPane.INFORMATION_MESSAGE);
		
		
		}
		else
			JOptionPane.showMessageDialog(frame, "Operation Aborted", "Aborted",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
}






}

