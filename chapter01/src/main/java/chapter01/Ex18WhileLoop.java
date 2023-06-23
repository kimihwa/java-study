package chapter01;

public class Ex18WhileLoop {

	public static void main(String[] args) {
		final int LOOP_COUNT = 10;
		
		// 1. Loop 조건 변수
		int i = 0;
		
		// 2. while Loop 조건
		while(i < LOOP_COUNT) { 
			// 3. 반복 코드
			System.out.println(i + ". hello");
			
			// 4. Loop 조건 변수를 변경
			i = i + 1;
		}

	}

}
