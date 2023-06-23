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
		
		//상수
		final double PI = 3.14; 
		System.out.println(PI);
		
		//final이 붙은 변수(상수)는 다시 값을 대입하지 못한다. 
		//PI = 3.1416; ERROR
		
		
	}
}
