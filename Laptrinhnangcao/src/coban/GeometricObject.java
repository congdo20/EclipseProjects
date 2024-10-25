package coban;

public class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated = new java.util.Date();
	
	public GeometricObject() {
		this.color = "White";
		this.filled = false;
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "Color: " + color + ", Filled: " + filled + "Date Created: " + dateCreated ;
	}
	
}
