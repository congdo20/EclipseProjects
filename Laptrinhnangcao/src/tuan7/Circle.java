package tuan7;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Circle circle2) {
        return Double.compare(this.radius, circle2.radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area=" + getArea() + "]";
    }
}

