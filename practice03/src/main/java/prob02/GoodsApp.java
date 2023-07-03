package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			String[] info = line.split(" ");
			
			String name = info[0];
			int price = Integer.parseInt(info[1]);
			int count = Integer.parseInt(info[2]);
			
			Goods g = new Goods();
			g.setName(name);
			g.setPrice(price);
			g.setCount(count);
			
			goods[i] = g;
			
		}
		// 상품 출력
		for(Goods g : goods) {
			System.out.println(g.getName() + "(가격:" + g.getPrice() + ")이 " 
							+ g.getCount() + "개 입고 되었습니다.");
		}
		// 자원정리
		scanner.close();
	}
}
