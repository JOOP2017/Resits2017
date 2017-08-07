import java.util.*;

public class Divergence {

	public static int[] charCount(String string) {
		if(string.length()==0)
		{
		return null;
		}
		else
		{  
		  
		  HashMap<String, Integer> repeat = new HashMap<String,Integer>();
           for(int i=0;i<string.length();i++)
           {
        	   
        	   String character = "";
        	   character += string.charAt(i);
        	   if(repeat.containsKey(character))
        	   {
        		   int old = repeat.get(character);
        		   old +=1;
        		   repeat.replace(character,old);
        	   }
        	   else {
        		    repeat.put(character, 1);
        		   
        	   }
           }
           ArrayList<String> a = new ArrayList<>();
           for(String word : repeat.keySet()){
        	   a.add(word);
           }
           Collections.sort(a);
           int[] res = new int[repeat.size()]; 
            for(int i=0;i<repeat.size();i++)
            {
               res[i] = repeat.get(a.get(i));
            }
            return res;
		}
		
	}

	public static int[][] charCountArray(String[] a) {
        int[][] result = new int[a.length][];
        for(int j=0;j<a.length;j++)
        {
        	for(int i = 0;i<a[j].length();i++)
        	{
        		result[j]=charCount(a[j]);
        	}
        }
        return result;
		
	}

	public static double[] normalise(int[] c) {
		int N= c.length;
		if(N==0)
		{
			return null;
		}
		else
		{
		double[] result = new double[N];
		int sum =0;
		for(int i = 0;i<N;i++)
		{    
			sum+=c[i];}
			for(int i= 0;i<N;i++)
			{
			result[i] = (double)c[i]/sum;
		}
		return result;

		}
		}

	public static double kld(double[] p, double[] q) {
		double sum=0;
		for(int i=0;i<p.length;i++)
		{
			sum+=p[i]*Math.log(p[i]/q[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		String a = new String(args[0]);
		String b = new String(args[1]);
		String[] e = {a,b};
		/*System.out.println("Counting "+a+":"+Arrays.toString(charCount(a)));
	/*	System.out.println("Symbol probabilities in "+a+":"+Arrays.toString(normalise(charCount(a))));
		System.out.println("Symbol probabilities in "+b+":"+Arrays.toString(normalise(charCount(b))));
		System.out.println("Shared Symbol Count "+":"+Arrays.toString((charCountArray(e))));
		System.out.println("Divergence PQ :%.3f"+0.009);
	}*/
		System.out.println(Arrays.toString(charCount("aacccb")));

	}
}

