import java.util.*;

public class Beads {
	
	public static Set<Integer> sums(ArrayList<Integer> beads,int n)
	{
		if(n<1)
		{
			Set<Integer> result = new HashSet<Integer>();
			
			
		return result;
			
		}
		else
		{   Set<Integer> finalList = new HashSet<Integer>(); 
			for(int i=0;i<beads.size();i++)
			{
				int count = n; int sum = beads.get(i);
				int pos = i;
				while(count>1)
				{
					pos = (pos+1)%beads.size();
					count = count-1;
					sum += beads.get(pos);
				}
				finalList.add(sum);
				
			}
		
			return finalList;
		}
		
}

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

	/*public static Set<Integer> allSums(ArrayList<Integer> beads)
	{
		if(beads.size()<1)                                                                                                         
		{
			Set<Integer> result = new HashSet<Integer>();
			
			
		return result;
			
		}
		else
		{
			Set<Integer> finalList = new HashSet<Integer>();
			Set<Integer> addList =new HashSet<Integer>();
			for(int i=1;i<=beads.size();i++)
			{ 
						addList = sums(beads,i);
			
			finalList.addAll(addList);
			}
			return finalList;
		}
	}*/

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
