package hinhhoc;

public class Circle extends Point {
	
	protected double radius;
	
	public Circle() {
		setRadius(0);
	}
	
	public Circle(double circleRadius, int x, int y) {
		super(x, y); // goi constructor lop cha
		setRadius(circleRadius);
	}
	
	public void setRadius(double circleRadius) {
		radius = (circleRadius >= 0 ? circleRadius : 0);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "Center = " + super.toString() + "; Radius = " + radius;
	}
	
	public String getName() {
		return "Circle";
	}
	
}
