package coban;

public class Point2D {
	private double x;
	private double y;
	
	Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y -y));
	}
	
	double distance(Point2D point) {
        double dx = this.x - point.getX();
        double dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	
	public String toString() {
		return "Diem co toa do la: (" + this.getX() + ", " + this.getY() + ")";
	}
	
	
	
	
}
