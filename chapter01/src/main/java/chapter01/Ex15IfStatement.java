package chapter01;

public class Ex15IfStatement {
	public static void main(String[] args) {
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		/*if (a1 >= a2 && a1 >= a3) {
				System.out.println("최대값은 " + a1 + "입니다.");
		} else if (a2 >= a1 && a2 >= a3) {
				System.out.println("최대값은 " + a2 + "입니다.");
		} else {
				System.out.println("최대값은 " + a3 + "입니다.");
			}*/
		
		if (a1 > a2) {
			// a1 a2
			if(a3 > a1) {
				System.out.println("최대값은" + a3 + "입니다.");
			} else {
				System.out.println("최대값은" + a1 + "입니다.");
			}
		} else {
			// a2 a1
			if(a3 > a2) {
				System.out.println("최대값은" + a3 + "입니다.");
			} else {
				System.out.println("최대값은" + a2 + "입니다.");
			}
		}
	}
}
