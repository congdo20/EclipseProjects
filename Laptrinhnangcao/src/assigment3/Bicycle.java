package assigment3;

public class Bicycle implements Vehicle{
	private double speed;
	
	public Bicycle() {
		this.speed = 0;
	}
	
	public Bicycle(double speed) {
		this.speed = speed;
	}
	
	public void start() {
		this.speed = 15;
		System.out.println("Xe dap khoi dong voi van toc: " + getSpeed() + " km/h.");
	}
	
	public void stop() {
		this.speed = 0;
		System.out.println("Xe dap dung lai.");
	}
	
	public double getSpeed() {
		return speed;
	}
}
