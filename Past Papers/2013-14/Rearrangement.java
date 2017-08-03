import java.util.Arrays;

public class Rearrangement {

	public static void rotate(int[] b) {
		int[] duplicate = new int[b.length];
		for (int i = 0; i < duplicate.length; i++){
			duplicate[i] = b[i];
		}
		
		for(int i = 1; i < b.length; i++){
			b[i] = duplicate[i-1];
		}
		
		b[0] = duplicate[duplicate.length-1];
	}

	public static int useSorted(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		return dotWith(a,b);
	}

	public static int useRotations(int[] a, int[] b) {
		if(a.length==b.length){
			int result1 = dotWith(a,b);
			rotate(b);
			int result2 = dotWith(a,b);
			return Math.max(result1, result2);
		}else{
		return 0;
		}
	}

	public static int dotWith(int[] a, int[] b) {
		int sum = 0;
		if (a.length == b.length){
			for (int i = 0; i < a.length; i++){
				sum += a[i]*b[i];
			}
		}
		return sum;
	}
	
	public static void main(String args[]){useSorted (new int[] {2, 1}, new int[] {3, 4});
		int n = Integer.parseInt(args[0]);
		int[] one = new int[n];
		int[] two = new int[n];
		for(int i = 0; i < n; i++){
			one[i] = Integer.parseInt(args[i+1]);
			two[i] = Integer.parseInt(args[i+1+n]);
		}
		System.out.println("dotWith gave: " + dotWith(one,two));
		System.out.println("useRotations gave: " + useRotations(one,two));
		System.out.print("useSorted gave: " + useSorted(one,two));
		
	}

	
}
