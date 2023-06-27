package Paint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(50);
		drawPoint(point);
		
		Point point2 = new Point(200, 150);
		drawPoint(point2);

	}
	
	public static void drawPoint(Point point) {
		point.show();
	}

}
