package tuan5;

public class TestCircle {
	public static void main(String[] args) {
		try {
			Circle circle1 = new Circle(10.0);
			//Circle circle2 = new Circle(-5.0);
			//Circle circle3 = new Circle(0.0);
			System.out.println("So circle thuc chat duoc tao ra: " + Circle.getCount());
			circle1.setRadius(-10.0);
			System.out.println("So circle thuc chat duoc tao ra: " + Circle.getCount());
		} catch (InvalidRadiusException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
