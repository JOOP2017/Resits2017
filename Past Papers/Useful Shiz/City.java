
public class City {
	private String name;

	private int population;
	private int noOfCastles;
	private String country;
	private int noOfUniversities;
	private double starRating; // out of 5
	
	public String getName() {
		return name;
	}
	public int getPopulation() {
		return population;
	}
	public int getNoOfCastles() {
		return noOfCastles;
	}
	public String getCountry() {
		return country;
	}
	public int getNoOfUniversities() {
		return noOfUniversities;
	}
	public City(String name, int population, int noOfCastles, String country, int noOfUniversities,double starRating) {
		super();
		this.name = name;
		this.population = population;
		this.noOfCastles = noOfCastles;
		this.country = country;
		this.noOfUniversities = noOfUniversities;
		this.starRating = starRating;
	}
	public double getStarRating() {
		return starRating;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + ", noOfCastles=" + noOfCastles + ", country="
				+ country + ", noOfUniversities=" + noOfUniversities + ", starRating=" + starRating + "]";
	}
	
	
}
