package assigment3;

public class TestShape {
  public static void main(String[] args) {

    Circle circle = new Circle(10, "Red", true);
    circle.display();

    Rectangle rectangle = new Rectangle(20, 30, "Green", true);
    rectangle.display();

    Square square = new Square(10, "Blue", true);
    square.display();
  }
}
