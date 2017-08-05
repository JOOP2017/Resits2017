import java.util.*;


public class ComplexNumbers {
    
	
	
	public static double[] complexConjugate(double[] a) {
		double[] c = new double[a.length];
		c[0] = a[0];
		c[1] = -a[1];
		return c;
	}

	public static double[] complexAdd(double[] a, double[] b) {
		double[] c = new double[a.length];
		c[0] = a[0]+b[0];
		c[1] = a[1]+b[1];
		return c;
	
	}

	public static double[] complexMultiply(double[] a, double[] b) {
		double[] d = new double[a.length];
		d[0] = a[0]*b[0]-a[1]*b[1];
		d[1] = a[1]*b[0]+a[0]*b[1];
		return d;
	}

	public static double[] complexReciprocal(double[] a) {
		double z[] = new double[a.length];
		double c = a[0]*a[0]+a[1]*a[1];
		z[0] = a[0]/c;
		z[1] = -a[1]/c;
		return z;
	}

	public static String toString(double[] z) {
		if(z[1] == 0.0){
			return Double.toString(Math.round(10.0*z[0])/10.0);
		}
		if(z[1]>0){
		String result = Math.round(10.0*z[0])/10.0 + "+" + Math.round(10.0*z[1])/10.0 + "i";
		return result;
		}
		else
		{
			String result = Math.round(10.0*z[0])/10.0 + "" + Math.round(10.0*z[1])/10.0 + "i";
			return result;
		}
	}
	
	private static Double magnitude(double[] matrix){
		return Math.sqrt((matrix[0]*matrix[0]+matrix[1]*matrix[1]));
	}

	public static double[][] sortByMagnitude (double[][] a) {
		Arrays.sort(a, new Comparator<double[]>(){public int compare(double[] a, double[] b){
			return Double.compare(magnitude(a),magnitude(b));
		}
		
		});

		return a;
	}
	
	public static void main(String args[])
	{
		double[] z1 = new double[2];
		double[] z2 = new double[2];
		double[] z3 = new double[2];
		z1[0] = Double.parseDouble(args[0]);
		z1[1] = Double.parseDouble(args[1]);
		z2[0] = Double.parseDouble(args[2]);
		z2[1] = Double.parseDouble(args[3]);
		System.out.println("("+toString(complexAdd(z1,z2))+")");
		System.out.println("("+toString(complexConjugate(z1))+")");
		System.out.println("("+toString(complexMultiply(z1,z2))+")");
		System.out.println("("+toString(complexReciprocal(z1))+")");
		double[] z = new double[2];
		z = (complexConjugate(complexAdd(z1,z2)));
		System.out.println("("+z[0]+""+z[1]+")");
		
		
	}

}
