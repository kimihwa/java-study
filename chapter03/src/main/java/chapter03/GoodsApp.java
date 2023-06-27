package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(20);
		camera.setCountSold(40);
		
		System.out.println("이름:" + camera.getName());
		System.out.println("가격:" + camera.getPrice());
		System.out.println("재고:" + camera.getCountStock());
		System.out.println("판매량:" + camera.getCountSold());
	}

}
