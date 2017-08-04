import java.util.*;
import java.util.function.ToDoubleFunction;

public class ComplexNumbers {
	public static double[] complexAdd(double[] z1, double[] z2){
		double[] result = new double[2];
		result[0] = z1[0] + z2[0];
		result[1] = z1[1] + z2[1];
		return result;
	}
	
	public static void main(String args[]){
		//System.out.print(Arrays.toString(complexAdd(new double[]{1.0,2.0}, new double[]{3.0,4.0})));
		double[] z1 = new double[2];
		double[] z2 = new double[2];
		double[] z3 = new double[2];
		z1[0] = Double.parseDouble(args[0]);
		z1[1] = Double.parseDouble(args[1]);
		z2[0] = Double.parseDouble(args[2]);
		z2[1] = Double.parseDouble(args[3]);
		System.out.println(Arrays.toString(complexAdd(z1,z2)));
		System.out.println(Arrays.toString(complexConjugate(z1)));
		System.out.println(Arrays.toString(complexMultiply(z1,z2)));
		System.out.println(Arrays.toString(complexReciprocal(z1)));
		System.out.println(Arrays.toString(complexConjugate(complexAdd(z1,z2))));
		double[][] test = new double[2][2];
		test[0] = z1;
		test[1] = z2;
		sortByMagnitude2(test);
		for(int i = 0 ; i < test.length; i++){
			System.out.println(Arrays.toString(test[i]));
		}
	}
	
	public static double[] complexConjugate(double [] z){
		double r = z[1];
		double[] fin = new double[2];
		fin[0] = z[0];
		fin[1] = -1*r;
		return fin;
	}
	
	public static double[] complexMultiply(double[] z1, double[] z2){
		double[] result = new double[2];
		result[0] = z1[0]*z2[0] - z1[1]*z2[1];
		result[1] = z1[1]*z2[0] + z1[0]*z2[1];
		return result;
	}
	
	public static double[] complexReciprocal(double[] z){
		double[] result = new double[2];
		result[0] = z[0]/(z[1]*z[1] + z[0]*z[0]);
		result[1] = -1*(z[1]/(z[1]*z[1] + z[0]*z[0]));
		return result;
	}
	
	
	public static String toString(double[] z){
		if(z[1] == 0.0){
			return Double.toString(Math.round(10.0*z[0])/10.0);
		}
		String result = Math.round(10.0*z[0])/10.0 + "+" + Math.round(10.0*z[1])/10.0 + "i";
		return result;
	}
	
	private static double magnitude(double[] matrix){
		return Math.sqrt((matrix[0]*matrix[0] + matrix[1]*matrix[1]));
	}
	
	private static Double magnitude(Double[] matrix){
		return Math.sqrt((matrix[0]*matrix[0] + matrix[1]*matrix[1]));
	}
	
	private Double[] convey(double[] v){
		Double[] result = new Double[v.length];
		for(int i = 0; i < v.length; i++){
			result[i] = v[i];
		}
		return result;
	}
	
	private Integer[] convey2(int[] v){
		Integer[] result = new Integer[v.length];
		for(int i = 0; i < v.length; i++){
			result[i] = v[i];
		}
		return result;
	}
	
	
	public static double[][] sortByMagnitude(double[][] complexList){
		double[][] copyOf = Arrays.copyOf(complexList, complexList.length);
		
		Comparator<double []> c = Comparator.comparingDouble(new ToDoubleFunction<double[]>(){
			public double applyAsDouble(double [] v){
				return Math.sqrt((v[0]*v[0])+(v[1]*v[1]));
			}
		});
		
		Arrays.sort(copyOf, c);
		return copyOf;
	}
	
	private static double[][] sortByMagnitude2(double[][] a){
		Arrays.sort(a, new Comparator<double[]>(){
			public int compare(double[]a, double[] b){
				return Double.compare(magnitude(a), magnitude(b));
			}
			
		});
		return a;
		
		
	}
	
}
