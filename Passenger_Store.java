
import java.util.ArrayList;


public class Passenger_Store 
{
	private ArrayList <Passenger> Passengers;
	
	public Passenger_Store()
	{
		Passengers = new ArrayList<Passenger>();    
		
	}

	public void addPassenger(Passenger e)
	{
		Passengers.add(e);
	}
	
	public Passenger getPassenger(int i)
	{
		return Passengers.get(i);
	}
	
	public void removePassenger(int i)
	{
		Passengers.remove(i);
	}
	
	public int getPassenger_StoreSize()
	{
	
		return Passengers.size();
	}

}
