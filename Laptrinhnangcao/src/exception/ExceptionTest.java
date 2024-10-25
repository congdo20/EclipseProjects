package exception;

public class ExceptionTest {
  public static double setRadius(double newRadius) throws IllegalArgumentException{
    double radius = 0;
    if (newRadius > 0) {
      radius = newRadius;
      System.out.println("Radius1: " + radius);
    } else if(newRadius < 0){
      throw new IllegalArgumentException("Radius cannot be negative");
    } else {
      throw new IllegalArgumentException("Radius cannot be zero");
    }

    return radius;
  }

  public static void main(String[] args) {
    System.out.println("Start");
    try {
      int quotient = 10 / 0;
      System.out.println("quotient = " + quotient);
    } catch(ArithmeticException e) {
      System.out.println("Exception's message: " +  e.getMessage());
    }
    System.out.println("End."); 

    System.out.println("Start");
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
  } catch(Exception e) {
    System.out.println("Something went wrong.");
  } 
  System.out.println("End.");   

  System.out.println("Start");
    try {
      double result = setRadius(0.0);
      System.out.println("Radius2: " + result);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("End.");
    } 

  }
}