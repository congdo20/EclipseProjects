package assigment3;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  @Override
  public void display() {
	  super.display();
	  System.out.println("Width: " + getWidth() + ", Height: " + getHeight() +", Area: " + getArea() + ", Perimeter: " + getPerimeter());
  }
}
