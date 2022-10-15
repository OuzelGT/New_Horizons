
public class Passenger extends Tickets
{
	private String first_name;
	private String last_name;
	private int age, tickNo;
	private String nationality;
	private Double price;
	
	
	public Passenger(String first_name, String last_name, int age, String nationality,
			String D, String type, int tickNo, Double price) 
	{
		super(D, type);
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.nationality = nationality;
		this.price = price;
		this.tickNo = tickNo;
	}
	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	



	
	

}