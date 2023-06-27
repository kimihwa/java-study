package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		if(n % 2 != 0) { 
			for(int i = 0; i < n+1; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
			System.out.println("결과값:" + sum);
		} else {
			for(int i = 0; i < n+1; i++) {
				if(i % 2 == 0) {
					sum += i;
				}
			}
			System.out.println("결과값:" + sum);
		}
		
		
		/* 코드 작성 */
//		while(true) {
//		}
//		
		
		scanner.close();
	
	}
}
