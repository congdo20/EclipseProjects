package tuan5;

public class WithdrawException extends Exception {
  public WithdrawException(double amount) {
    super("So tien nhap lon hon so du hien tai: " + amount);
  }
}
