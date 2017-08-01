import java.util.Arrays;
import java.util.Comparator;

public class HolidayDestinations {
	public static void main(String[] args){
		City edinburgh = new City("Edinburgh",50000,1,"Scotland",3,4.9 );
		City glasgow = new City("Glasgow", 600,0,"Scotland",3,0.1);
		City aberdeen = new City("Aberdeen", 3, 1, "Scotland", 2,-1.0);
		City london = new City("London", 50000, 2, "England", 9,4.0);
		City[] possDest = {edinburgh,glasgow,aberdeen,london};
		System.out.println(Arrays.toString(compareDest(possDest)));
	}

	
	public static City[] compareDest(City[] destinations){
	City[] destCopy = Arrays.copyOf(destinations, destinations.length);
	
	//pop asc
	Comparator<City> comp1 = (c1,c2) 
			-> Integer.compare(c1.getPopulation(), c2.getPopulation());
	
	// city name alpha
	Comparator<City> comp2 = (c1,c2)
			-> c1.getName().compareTo(c2.getName());
			
	//pop castles desc
	Comparator<City> comp3 = (c1,c2) 
			-> Integer.compare(c2.getNoOfCastles(), c1.getNoOfCastles());

	
	//star rating desc
	
	Comparator<City> comp4 = (c1,c2)
			-> Double.compare(c2.getStarRating(), c1.getStarRating());
			Arrays.sort(destCopy,comp4);
	
	return destCopy;
	}
	
	
}
