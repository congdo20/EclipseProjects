package tuan5b3;

public class BankAccount {
  protected String accountNumber;
  protected String accountHolderName;
  protected double balance;

  public BankAccount() {

  }

  public BankAccount(String accountNumber, String accountHolderName, double balance) throws IllegalArgumentException {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    if (balance >= 0) {
      this.balance = balance;
    } else {
      throw new IllegalArgumentException("So du ban dau phai lon hon hoac bang khong.");
    }
  }

  public void deposit(double amount) throws IllegalArgumentException {
    if (amount > 0) {
      balance += amount;
      System.out.println("Nap tien thanh cong, so du hien tai: " + balance);
    } else {
      throw new IllegalArgumentException("So tien nap phai lon hon 0.");
    }
  }

  public void withdraw(double amount) throws WithdrawException {
    if (amount <= 0) {
      throw new IllegalArgumentException("So tien rut phai lon hown 0.");
    } else if (amount > balance) {
      throw new WithdrawException("So tien rut lon hon so du.");
    } else {
      balance -= amount;
      System.out.println("Rut tien thanh cong, so du hien tai: " + balance);
    }
  }

  public double getBalance() {
    return balance;
  }

}
