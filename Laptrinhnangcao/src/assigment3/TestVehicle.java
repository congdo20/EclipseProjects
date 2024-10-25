package assigment3;

public class TestVehicle {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		System.out.println("Toc do hien tai cua o to la: " + car.getSpeed() + " km/h.");
		car.stop();
		System.out.println("");
		
		Bicycle bicycle = new Bicycle();
		bicycle.start();
		System.out.println("Toc do hien tai cua xe dap la: " + bicycle.getSpeed() + " km/h.");
		bicycle.stop();
		System.out.println("");
		
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.start();
		System.out.println("Toc do hien tai cua xe may la: " + motorcycle.getSpeed() + " km/h.");
		motorcycle.stop();		
	}
}
