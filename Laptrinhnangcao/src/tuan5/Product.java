package tuan5;

public class Product {
	private String productId;
	private String productName;
	private int quantity;
	private double price;
	
	public Product() {
		
	}
	
	public Product(String productId, String productName, int quantity, double price) throws IllegalArgumentException {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		if(quantity >= 0) {
			this.quantity = quantity;
		} else {
			throw new IllegalArgumentException("Nhap so luong am: " + quantity);
		}
	}
	
	public void addStock(int amount) {
		if(amount >= 0) {
			this.quantity += amount;
			System.out.println("Them " + amount + " san pham. So luong hien tai la: " + quantity);
		} else {
			throw new IllegalArgumentException("Nhap so luong am: " + amount);
		}
	}
	
	public void removeStock(int amount) throws IllegalArgumentException, RemoveStockException{
		if(amount < 0) {
			throw new IllegalArgumentException("Nhap so luong am: " + amount);
		} else if (amount >= 0 && amount <= quantity) {
			this.quantity -= amount;
		} else {
			throw new RemoveStockException(amount);
		}
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setQuantity(int quantity) throws IllegalArgumentException {
		if(quantity >= 0) {
			this.quantity = quantity;
		} else {
			throw new IllegalArgumentException("Nhap so luong am: " + quantity);
		}
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getQuantity() {
	return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
}
