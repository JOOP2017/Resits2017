
public class Inequalities {

	public static boolean cs(int[] a, int[] b) {
		int lhs = (int)(Math.pow(dotProduct(a,b),2));
		int rhs = dotProduct(a,a)*dotProduct(b,b);
		if(a.length == b.length &&  lhs < rhs)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int[] concatenate(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		for(int i = 0 ; i<a.length;i++)
		{
			c[i] = a[i];
			c[i+a.length] = b[i];
		}
		
		return c;
		
	}

	public static boolean amgm(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		int product =1;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
			product *= a[i];
		}
		double am = sum/a.length;
		double gm = Math.pow(product,1/a.length);
		if(am>=gm)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}


	public static int dotProduct(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		if(a.length!=b.length)
		{
			return 0;
		}
		else
		 {   int sum = 0;
			for(int i = 0;i<a.length;i++)
			{
				sum += a[i]*b[i];
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int[] one = new int[a];
		int[] two = new int[a];
		for(int i=0;i<a;i++){
			one[i]= Integer.parseInt(args[i+1]);
			two[i] = Integer.parseInt(args[i+a+1]);
		}
		System.out.println("CS held: "+cs(one,two));
		System.out.println("AMGM held: "+amgm(concatenate(one,two)));
	
		
	}

	

}
