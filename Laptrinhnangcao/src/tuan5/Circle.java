package tuan5;

public class Circle {
	private double radius;
	private static int count = 0;
	
	public Circle(double radius) throws InvalidRadiusException{
		setRadius(radius);
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) throws InvalidRadiusException{
		if (radius <= 0) {
			throw new InvalidRadiusException(radius);
		} else {
			this.radius = radius;
			count++;
		}
	}
	
	public static int getCount() {
		return count;
	}
	
	
	
	
	
}
