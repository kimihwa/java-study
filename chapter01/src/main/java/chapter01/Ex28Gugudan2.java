package chapter01;

public class Ex28Gugudan2 {

	public static void main(String[] args) {
//		System.out.println("hello World");
//		//System.out.print("hello world" + "\n"); 개행문자 "\n"	
//		System.out.println("=======");

		for(int i = 1; i <= 9; i++) { //곱해지는 수
			for(int j = 1; j <= 9; j++) { // 단
				System.out.print(j + " x " + i + " = " + j*i);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}

}
