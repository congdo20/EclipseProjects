package Vehicle2;

public class ElectricCar extends Car implements ElectricVehicle{
	private double batteryLevel;
	
	public ElectricCar() {
		this.batteryLevel = 100;
	}
	
	public ElectricCar(double batteryLevel, double fuelConsumption, double speed) {
		super(fuelConsumption, speed);
		this.batteryLevel = batteryLevel;
	}
	
	public double getBatteryLevel() {
		return batteryLevel;
	}
	
	public void chargeBattery(double amount) {
		if (getBatteryLevel() + amount <= 100) {
			batteryLevel += amount;
			System.out.println("Da sac, muc pin hien tai la: " + getBatteryLevel() + "%");
		} else {
			System.out.println("Khong the sac.");
		}
	}
	
}
