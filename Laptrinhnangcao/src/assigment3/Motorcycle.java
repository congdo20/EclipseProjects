package assigment3;

public class Motorcycle implements Vehicle {
	private double speed;
	
	public Motorcycle() {
		this.speed =  0;
	}
	
	public Motorcycle(double speed) {
		this.speed = speed;
	}
	
	public void start() {
		this.speed = 80;
		System.out.println("Xe may khoi dong voi van toc: " + getSpeed() + " km/h.");
	}
	
	public void stop() {
		this.speed = 0;
		System.out.println("Xe may dung lai.");
	}
	
	public double getSpeed() {
		return speed;
	}
}
