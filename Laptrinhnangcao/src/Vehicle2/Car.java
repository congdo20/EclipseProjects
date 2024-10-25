package Vehicle2;

public class Car implements Vehicle{
	private double fuelConsumption;
	private double speed;
	private boolean engineOn;
	
	public Car() {
		this.fuelConsumption = 7;
        this.speed = 0;
        this.engineOn = false;
	}
	
	public Car(double fuelConsumption, double speed) {
		this.fuelConsumption = fuelConsumption;
		this.speed = 0;
		this.engineOn = false;
	}
	
	
	public void startEngine() {
		this.engineOn = true;
		this.speed  = 50;
		System.out.println("O to khoi dong.");
	}
	
	public void stopEngine() {
		this.engineOn = false;
		this.speed = 0;
		System.out.println("O to dung lai.");
	}
	
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public boolean isEngineOn() {
		return engineOn;
	}
	
	
}
