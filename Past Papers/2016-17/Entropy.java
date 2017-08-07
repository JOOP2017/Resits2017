import java.util.*;
public class Entropy {

	public static int[][] charCountArray(String[] strings) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[] charCount(String s) {
		if (s.equals("")){
			return null;
		}
		HashMap<String, Integer> repeat = new HashMap<String,Integer>();
		for (int i = 0; i<s.length(); i++){
			String character = "";
			character += s.charAt(i);
			if(repeat.containsKey(character)){
				int old = repeat.get(character);
				old += 1;
				repeat.replace(character, old);
			}else{
				repeat.put(character, 1);
			}
		}
		ArrayList <String> alphabet = new ArrayList <String>();
		
		
		for (String key: repeat.keySet()){
			alphabet.add(key);
		}
		
		Comparator<String> sSort = new Comparator <String>()
		{
			public int compare(String s1, String s2){
				return s1.compareTo(s2);
			}
		};
		
		Collections.sort(alphabet, sSort);
		
		int[] result = new int[alphabet.size()];
		for(int i = 0; i<alphabet.size();i++){
			result[i] = repeat.get(alphabet.get(i));
		}
		
		return result;
	}

	public static double[] normalise(int[] is) {
		if (is.length == 0){
			return null;
		}
		double sum = 0.0;
		for (int i = 0; i < is.length; i++){
			sum += is[i];
		}
		double[] result = new double[is.length];
		for (int i = 0; i < is.length; i++){
			result[i] = is[i]/sum;
		}
		return result;
	}

	public static void main(String[] inputs) {
		String s1 = inputs[0];
		String s2 = inputs[1];
		System.out.println("Character Probabilities in " + s1 + Arrays.toString(normalise(charCount(s2))));
		System.out.println("Entropy of " + s1 + entropyOf(normalise(charCount(s1))));
		System.out.println("Entropy of " + s2 + entropyOf(normalise(charCount(s2))));
		System.out.println("");
		System.out.print("");
		
		
		
	}

	public static double entropyOf(double[] ds) {
		double result = 0;
		for (int i = 0 ; i < ds.length ; i ++){
			result += -1*ds[i]*Math.log(ds[i]);
		}
		return (Math.round((result*10000.0)))/10000.0;
	}

}
