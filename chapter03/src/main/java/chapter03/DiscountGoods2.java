package chapter03;

import mypakage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.3f;
	
	public int getDiscountPrice() {
		return (int)(price * discountRate);
	}
}
