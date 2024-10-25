package hinhhoc;

public class Point extends Shape1 {
	protected int x,y;
	
	public Point() {
		setPoint(0, 0);
	}
	
	public Point(int x, int y) {
		setPoint(x, y);
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
	
	public String getName() {
		return "Point";
	}
	
	public double area() {
		return x * y;
	}
	
}
