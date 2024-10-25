package tuan7;

import java.util.Arrays;

public class SortCircles {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle(2.1);
        circles[2] = new Circle(5.0);
        circles[3] = new Circle(1.8);
        circles[4] = new Circle(4.2);

        Arrays.sort(circles);

        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}

