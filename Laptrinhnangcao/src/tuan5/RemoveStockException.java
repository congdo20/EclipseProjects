package tuan5;

public class RemoveStockException extends Exception {
	public RemoveStockException(int amount) {
		super("Khong du san pham de xuat khoi kho: " + amount);
	}
}
