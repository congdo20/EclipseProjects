package Vehicle2;
import java.util.ArrayList;
import java.util.List;

public class TrafficManagementSystem {
    List<Vehicle> vehicles = new ArrayList<>();
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    
    public void displayVehiclesInfo() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Toc do: " + vehicle.getSpeed() + " km/h, tieu thu: " + vehicle.getFuelConsumption());
            if (vehicle instanceof ElectricVehicle) {
                ElectricVehicle ev = (ElectricVehicle) vehicle;
                System.out.println("Muc pin: " + ev.getBatteryLevel() + "%");
            }
        }
    }
    
    public void manageFuelAndBattery() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof ElectricVehicle) {
                ElectricVehicle ev = (ElectricVehicle) vehicle;
                ev.chargeBattery(10); 
            } else {
                System.out.println("Tiep nhien lieu.");
            }
        }
    }
}
