
public class Destination {

	private String destination;
	private int population;
	private String capital;
	private Double distance;
	private Double duration;
	
	public Destination(String destination, int population, String capital, Double distance, Double duration) {
		super();
		this.destination = destination;
		this.population = population;
		this.capital = capital;
		this.distance = distance;
		this.duration = duration;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
}
