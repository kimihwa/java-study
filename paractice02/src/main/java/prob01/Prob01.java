package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		System.out.print("금액:");
		int m = scanner.nextInt(); //금액 입력받기
		
//		int m1 = m / MONEYS[0];
//		int m2 = (m % MONEYS[0])/MONEYS[1];
//		int m3 = m2 % MONEYS[2];
//		int m4 = m3 % MONEYS[3];
//		int m5 = m4 % MONEYS[4];
//		int m6 = m5 % MONEYS[5];
//		int m7 = m6 % MONEYS[6];
//		int m8 = m7 % MONEYS[7];
//		int m9 = m7 % MONEYS[8];
//		int m10 = m7 % MONEYS[9];
//		int[] sum = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10};
		
		
//		for(int i = 0; i < MONEYS.length; i++) {
//			System.out.println(MONEYS[i] + "원:" + sum[i]+ "개");
//		}
//		
		
		scanner.close();
 	}
}