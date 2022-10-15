import java.util.Random;

public class Tickets {
	
	String destination;
	private String type;
	private String tickNo;
	private Double price;
	private double multiplier;
	private int distanceValue;
	


	public Tickets(String destination, String type) 
	{
		super();
		this.destination = destination;
		this.type = type;
		
	}
	
	

	public String getDestination() 
	{
		return destination;
	}



	public void setDestination(String destination) 
	{
		this.destination = destination;
	}



	public String getType() 
	{
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	
	public double getMultiplier()
	{
		
		if(type == "Single") 
		{
			multiplier = 1.0;
		}
		if(type == "Family") 
		{
			multiplier = 3.0;
		}
		if(type == "VIP") 
		{
			multiplier = 2.5;
		}
		return multiplier;
	}



	public void setMultiplier(double multiplier)
	{
		this.multiplier = multiplier;
	}




	public int getDistanceValue() 
	{
		if(destination == "Moon Mines")
		{
			distanceValue = 1000;
		}
		if(destination == "Mars")
		{
			distanceValue = 2000;
		}
		if(destination == "Space Station")
		{
			distanceValue = 4000;
		}
		
		if(destination == "New Earth")
		{
			distanceValue = 60000;
		}
		
		return distanceValue;
	}



	public void setDistanceValue(int distanceValue) {
		this.distanceValue = distanceValue;
	}



	public String getTickNo() 
	{
		int rand = getRandomNumberInRange(82768, 84536);
	
		tickNo = String.valueOf(rand);
		return tickNo;
	}





	public void setTickNo(String tickNo) {
		this.tickNo = tickNo;
	}





	public Double getPrice() {
		
		price = getDistanceValue()*getMultiplier();
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	
	public void printDetails()
	{
		   System.out.println("Ticket Details");
		   System.out.println("============");
		   System.out.println("Destination: "+ destination);
		   System.out.println("Ticket Price: "+price);
		  
	}



}
