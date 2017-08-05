package learn;
import java.util.*;

public class ComparitoR implements Comparator<Double[]> {
	public int compare(Double[] a,Double[] b){
		
		return ComparatorTesting.get_mag(a).compareTo(ComparatorTesting.get_mag(b));
	}

}
