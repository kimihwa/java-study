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

}
