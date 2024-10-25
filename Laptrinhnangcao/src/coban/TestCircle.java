package coban;

public class TestCircle {
	public static void main(String[]  args) {
		GeometricObject geometric = new GeometricObject();
		Circle circle = new Circle();
		String result = geometric.toString();
		System.out.println(result);
		
		circle.printCircle();
 	}
}
