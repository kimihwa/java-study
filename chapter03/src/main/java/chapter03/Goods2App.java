package chapter03;

import mypakage.Goods2;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		// public은 접근 제한이 없다
		g.name = "camera";
		
		// protected는 
		// 1. 같은 패키지에서만 접근할 수 있다
		// 2. 더 중요한 것은 자식에서 접근 가능하게 한다
		// g.price = 1000;
		
		// 디폴트는 같은 패키지에서만 접근할 수 있다
		// g.countStrock = 20;
		
		// private은 내부에서만 사용할 수 있다 
		// g.countSold = 10;
	}

}
