package Paint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(50);

		drawPoint(point);
		point.show(false);
		
		Point point2 = new Point(200, 150);
		drawPoint(point2);
		point2.show(false);
		
		// 부모로 레퍼런싱
//		Point point3 = new ColorPoint();
//		point3.setX(200);
//		point3.setY(100);
		Point point3 = new ColorPoint(200, 100,"red");
		// ColorPoint point4 = (ColorPoint)point3;
		((ColorPoint)point3).setColor("red");
		
		drawPoint(point3);

	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}

}
