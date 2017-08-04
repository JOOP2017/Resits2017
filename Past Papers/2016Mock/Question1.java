import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {

	public static ArrayList<Integer> cayley() {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=1; i<10; i++){
			for (int j = 0; j < 10; j++){
				String t = "";
				int y = 0;
				y = Integer.parseInt(t=i+ "" + j);
				if(i+j + i*j == y){
					result.add(y);
				}
			}
		}
		return result;
	}

	public static int[] countVowels(String[] inputs) {
		int[] result = new int[inputs.length];
		for(int j=0; j < inputs.length; j++){
			int count = 0;
			for(int i = 0; i < inputs[j].length();i++){
				if(Character.toLowerCase(inputs[j].charAt(i))=='a'||Character.toLowerCase(inputs[j].charAt(i))=='e'||Character.toLowerCase(inputs[j].charAt(i))=='i'||Character.toLowerCase(inputs[j].charAt(i))=='o'||Character.toLowerCase(inputs[j].charAt(i))=='u'){
					count += 1;
				}
			}
			result[j] = count;
		}
		return result;
	}

	public static String mostVowels(String[] inputs) {
		if(inputs.length == 0){
			return "";
		}
		int[] amountVowels = countVowels(inputs);
		int index = 0;
		int max = 0;
		for (int i = 0; i< inputs.length; i++){
			if (max<amountVowels[i]){
				max = amountVowels[i];
				index = i;
			}
		}
		return inputs[index];
	}

	public static void main(String[] args) {
		cayley();
		System.out.println(cayley());
		//String[] inputs = new String[args.length];
		//for ( int i = 0; i<args.length; i++){
		//	inputs[i] = args[i];
		//}
		System.out.println(Arrays.toString(countVowels(args)));
		System.out.print(mostVowels(args));
		
		
	}

}
