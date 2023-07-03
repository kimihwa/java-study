package prob04;

public class StringUtil {

	public static String concatenate(String[] str) {
		String result ="";
		for(int i = 0; i < str.length; i++) {
			result += str[i];
		}
		return result;
	}
}
