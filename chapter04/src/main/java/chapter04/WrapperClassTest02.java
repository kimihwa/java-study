package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		String s1 = "1234";
		int i = Integer.parseInt(s1);

		// cf1
		String s2 = String.valueOf(i);
		
		//cf2
		String s3 = "" + i;
		
		System.out.println(s1 + ":" + s2 + ":" + s3);
		
		char c = 'A';
		int i2 = Character.getNumericValue(c);
		System.out.println(i2);

		// 2진수
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);
		
		// 16진수
		String s5 = Integer.toHexString(15);
		System.out.println(s5);
	}

}
