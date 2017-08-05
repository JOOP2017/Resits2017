package learn;

public class step {
	public static void main(String args[]){
		int n=10;
		int a;
		if(n%2==0)a=0;
		else a=1;
		int sum=0;
		while(a<=n){
			int b=(int)((n-a)/2);
			sum+=choose(a+b,a);
			
			a+=2;
		}
		System.out.print(sum);
		
	}
	
	public static double choose(int x, int y) {
	    if (y < 0 || y > x) return 0;
	    if (y > x/2) {
	        // choose(n,k) == choose(n,n-k), 
	        // so this could save a little effort
	        y = x - y;
	    }

	    double answer = 1.0;
	    for (int i = 1; i <= y; i++) {
	        answer *= (x + 1 - i);
	        answer /= i;           // humor 280z80
	    }
	    return answer;
	}
}
