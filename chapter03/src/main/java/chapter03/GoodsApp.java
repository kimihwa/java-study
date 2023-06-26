package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		camera.countStock = 20;
		camera.countSold = 40;
		
		System.out.println("이름:" + camera.name );
		System.out.println("가격:" + camera.price);
		System.out.println("재고:" + camera.countStock);
		System.out.println("판매량:" + camera.countSold);
	}

}
