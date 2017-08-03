import java.util.*;
public class Rabbit {
	private Integer[][] r;
	private int n;
	
	public Rabbit(int y) {
		n = y;
		r = new Integer[n][];
	}

	public void init() {
		if (n>=2){
			r[0] = new Integer[]{1};
			r[1] = new Integer[]{1,0};
			for (int i = 2; i < n; i++){
				ArrayList<Integer> next  = new ArrayList<Integer>();
				for(Integer m : r[i-1]){
					next.add(m);
				}
				for(Integer m: r[i-2]){
					next.add(m);
				}
				r[i] = next.toArray(new Integer[next.size()]);
			}
		}
		
		
	}
	
	public String toString(){
		String result = "";
		for (int i=0; i < r.length; i++){
			result += "\n" + Arrays.toString(r[i]);
		}
		return result;
	}

	public int subsequenceIndex(Integer[] target) {
		Integer[] longestSequence = r[n-1];
		boolean valid = true;
		for(int i=0; i<longestSequence.length-target.length+1; i++){
			for(int j = 0; j < target.length; j++){
				if(longestSequence[j+i].equals(target[j])){
					valid &= true;
				}else{
					valid = false;
				}
			}
			if(valid){
				return i;
			}else{
				valid = true;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		Rabbit test = new Rabbit(input);
		test.init();
		System.out.println(test.toString());
		System.out.println(test.subsequenceIndex(new Integer[]{1,1,0}));
		System.out.print(test.subsequenceIndex(new Integer[]{1,1,0}));
		
		
	}

}
