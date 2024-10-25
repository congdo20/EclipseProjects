package assigment3;

public class Square extends Shape {
  private double side;

  public Square(double side, String color, boolean filled) {
    super(color, filled);
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return side * side;
  }

  @Override
  public double getPerimeter() {
    return 4 * side;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Side: " + getSide() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter());
  }

}
