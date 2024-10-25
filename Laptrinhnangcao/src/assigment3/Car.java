package assigment3;

public class Car implements Vehicle {
  private double speed;

  public Car() {
	  this.speed = 0;
  }
  
  public Car(double speed) {
    this.speed = speed;
  }

  public void start() {
    this.speed = 50;
    System.out.println("O to khoi dong voi van toc: " + getSpeed() +" km/h.");
  }

  public void stop() {
    this.speed = 0;
    System.out.println("O to dung lai.");
  }
  
  public double getSpeed() {
	  return speed;
  }

}
