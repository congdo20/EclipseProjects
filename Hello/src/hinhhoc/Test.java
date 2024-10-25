package hinhhoc;
import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		Point point = new Point(7,11);
		Circle circle = new Circle(3.5, 22, 8);
		Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);
		
		
		Shape1 arrayOfShape[] = new Shape1[3];
		arrayOfShape[0] = point;
		arrayOfShape[1] = circle;
		arrayOfShape[2] = cylinder;
		
		String output = point.getName() + ": " + point.toString() + "\n"
					  + circle.getName() + ": " + circle.toString() + "\n" 
					  + cylinder.getName() +  ": " + cylinder.toString() + "\n";
		
		
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		for (int i = 0; i < arrayOfShape.length; i++) {
			output += "\n\n" + arrayOfShape[i].getName() +
					": " + arrayOfShape[i].toString() +
					"\n Area = " + 
					precision2.format( arrayOfShape[i].area()) + 
					"\nVolume = " + 
					precision2.format( arrayOfShape[i].volume());
		}
		
		System.out.println(output);
		System.exit(0);
		
		
	}
}
