package chapter01;

/*
 * 리터럴(literal)이란 프로그램 코드에 직접적으로 표현되는 값
 */
public class Ex02Literal {

	public static void main(String[] args) {
		float f = 3.14f;
		double d = 3.14;
		
		short s = 3;
		int i = 1;
		long l = 12345678901L; //int 범위 넘어가서 리터럴해줌
		
		char c = 'A';
		byte b = 65; //utf-8은 3byte. java는 효율성 때문에 2byte 사용
		
		boolean bool = false;
		
		System.out.println(f);
		System.out.println(d);

		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println(b);
		
		System.out.println(bool);
	}

}
