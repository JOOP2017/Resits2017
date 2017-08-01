import java.util.*;

public class Beads {

	public static HashSet<Integer> allSums(ArrayList<Integer> beads) {
		HashSet<Integer> nums = new HashSet<Integer>();
		if (beads.size() == 0){
			return nums;
		}
		for (int i = 1; i < beads.size(); i++){
			nums.addAll(sums(beads,i));
		}
		return nums;
	}

	public static HashSet<Integer> sums(final ArrayList<Integer> beads, int n) {
		HashSet<Integer> sums = new HashSet<Integer>();
		int lengthofArrayList = beads.size();
		if (n < 1 || lengthofArrayList == 0){
			return sums;
		}
		ArrayList<Integer> line = new ArrayList<>(lengthofArrayList);
		while (line.size() < (beads.size() + n)){
			line.addAll(beads);
		}
		for (int i = 0; i < lengthofArrayList; i++){
			int j = i + n;
			
			int sum = 0;
			for (int k = i; k < j; k++){
				sum += line.get(k);
			}
		sums.add(sum);
		}
		return sums;
	}

	public static int findMax(Set<Integer> beads) {
		int max = 0;
		int i = 1;
		while (beads.contains(i)){
				max += 1;
				i += 1;
			}
			return max;
		}

	public static void main(String args[]) {
		ArrayList<Integer> lines = new ArrayList<Integer>(args.length);
		for (int i = 0; i <  args.length; i++){
			lines.add(Integer.parseInt(args[i]));
		}
		
		HashSet<Integer> yaldi = new HashSet<Integer>();
		yaldi = allSums(lines);
		int maximus = findMax(yaldi);
		System.out.print(maximus);
	}

}
