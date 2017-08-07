import java.util.*;

public class Sort3dvec {

	public static void main(String[] args) {
		Random rand=new Random();
		
		//First we will sort an array of double arrays which represets
		//a list of 3d vectors, by magnitude
		
		double[][] vecs = new double[10][3];
		
		for(int i=0;i<10;i++){
			for(int j=0;j<3;j++){
				vecs[i][j]=rand.nextInt(100);
			}
		}
		System.out.println(Arrays.deepToString(vecs));
		
		vecs=sort_3dVectors(vecs);
		System.out.println(Arrays.deepToString(vecs));
		
		
	}
	
	
	
	public static double[][] sort_3dVectors(double[][] vectors){
		//write the comparator here
		return new double[10][3];
	}

	
	public static double magnitude(double[] vec){
		double sum=0;
		for (double x: vec){
			
			sum+= x*x;
		}
		
		return Math.sqrt(sum);
		
	}
}
	



	

