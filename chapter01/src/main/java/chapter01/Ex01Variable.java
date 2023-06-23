package chapter01;

public class Ex01Variable {
	public static void main(String[] args) {
		int i = 10;
		String s = "Hello";
		
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경 로직(algorithm)");
		i = 2000;
		s = "Hello World";
		
		System.out.println(i);
		System.out.println(s);
		
		final double pi = 3.14; //상수
		System.out.println(pi);
		
	}
}
