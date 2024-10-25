package tuan5;

public class InvalidRadiusException extends Exception{
	public InvalidRadiusException(double radius){
		super("Invalid radius: " + radius);
	}
}
