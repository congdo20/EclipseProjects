package Vehicle2;

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car(7, 50); 
        ElectricCar electricCar = new ElectricCar(80, 0, 0);
        Motorcycle motorcycle = new Motorcycle(3, 0); 

        TrafficManagementSystem tms = new TrafficManagementSystem();
        tms.addVehicle(car);
        tms.addVehicle(electricCar);
        tms.addVehicle(motorcycle);
        
        tms.displayVehiclesInfo();
        tms.manageFuelAndBattery();
    }
}
