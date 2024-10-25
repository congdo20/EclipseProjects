package generic;

import assigment3.Circle;
import assigment3.Rectangle;
import assigment3.Shape;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 2, "blue", true);
        Circle circle = new Circle(2, "red", true);
        System.out.println("Same area? " + equalArea(rectangle, circle));
    }

    public static <E extends Shape> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }
}
