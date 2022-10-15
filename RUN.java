
public class RUN {

	public static void main(String[] args) 
	{
		//PASSENGERMESS myPMgui = new PASSENGERMESS();

		Destination_GUI myDgui = new Destination_GUI();
		Ticket_GUI myTgui = new Ticket_GUI();
		Admin_GUI myAgui = new Admin_GUI();
		Passenger_Input_GUI myPgui = new Passenger_Input_GUI();
		
		
		myDgui.pass_tGUI(myTgui);
		myDgui.pass_aGUI(myAgui);
		myDgui.pass_pGUI(myPgui);
		myPgui.pass_aGUI(myAgui);
		myPgui.pass_dGUI(myDgui);
		myPgui.pass_tGUI(myTgui);
		myTgui.pass_pGUI(myPgui);
		myTgui.pass_dGUI(myDgui);
		myTgui.pass_aGUI(myAgui);
	}

}
