package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a1) {
		double[] result = null;
		
		if(a1 == null) {
			return result;
		}
		
		result = new double[a1.length];
		for(int i = 0; i < a1.length; i++) {
			result[i] = a1[i];
		}
		
		return result;
	}

	public static int[] doubleToInt(double[] d2) {
		int[] result = null;
		
		if(d2 == null) {
			return result;
		}
		
		result = new int[d2.length];
		for(int i = 0; i < d2.length; i++) {
			result[i] = (int)d2[i];
		}
		
		return result;
	}

	public static void concat(int[] s1, int[] s2) {
		int[] a3 = new int[s1.length + s2.length];
		
	}
	
	

}
