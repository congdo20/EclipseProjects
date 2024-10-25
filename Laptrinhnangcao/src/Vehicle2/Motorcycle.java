package Vehicle2;

public class Motorcycle implements Vehicle{
	private double fuelConsumption;
	private double speed;
	private boolean engineOn;
	
	public Motorcycle() {
        this.fuelConsumption = 3;
        this.speed = 0;
        this.engineOn = false;
    }
	
	public Motorcycle(double fuelConsumption, double speed) {
		this.fuelConsumption = fuelConsumption;
		this.speed = speed;
		this.engineOn = false;
	}
	
	public void startEngine() {
		this.engineOn = true;
		this.speed  = 50;
		System.out.println("Xemay khoi dong");
	}
	
	public void stopEngine() {
		this.engineOn = false;
		this.speed = 0;
		System.out.println("Xe may dung lai");
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
