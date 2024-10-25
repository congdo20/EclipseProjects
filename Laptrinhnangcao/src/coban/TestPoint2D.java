package coban;

public class TestPoint2D {
	public static void main(String[] args) {
		Point2D point = new Point2D(2.0, 3.0);
		Point2D point1 = new Point2D(3.0, 4.0);
		
		System.out.println(point.toString());
		System.out.println(point1.toString());
		
		double result = point.distance(point1);
		double result1 = point.distance(3.0, 4.0);
		
		printResult("point", "point1", result);
		printResult("point", "point2", result1);
		
	}
	
	public static void printResult(String a, String b, double result) {
		System.out.println("khoang cach giua hai diem " + a + " va " + b + " la: " + result);
	}
}
