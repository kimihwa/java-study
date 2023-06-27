package chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countOfGoods = 0;
	
	public Goods() {
		countOfGoods = countOfGoods + 1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("재고:" + countStock);
		System.out.println("판매량:" + countSold);
	}

	public int calcDiscountprice(double discountRate) {
		return (int)(price * discountRate);
	}
	
}
