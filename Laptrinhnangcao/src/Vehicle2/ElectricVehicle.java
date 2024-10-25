package Vehicle2;

public interface ElectricVehicle extends Vehicle {
	public abstract double getBatteryLevel();
	public abstract void chargeBattery(double amount);
}
