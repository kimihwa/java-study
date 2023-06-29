package prob5;

public class Prob5 {

	public static void main(String[] args) {
//		for(int i=1; i<100; i++) {
//			String number = String.valueOf(i);
//			char c = number.charAt(i);
//			int count = 0;
//			
//			if (c== '3' || c == '6' ||c == '9') {
//				count++;
//				System.out.println("짝");
		int count = 0;
		for(int i = 1; i < 100; i++) {
			String number = String.valueOf(i);
			char c = number.charAt(i);
			if (c== '3' || c == '6' ||c == '9') {
				count++;
				System.out.println("짝" + count);
			}
		}
	}
}
