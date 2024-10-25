package tuan5;

public class BankAccount {
  private String accountNumber;
  private String accountHolderName;
  private double balance;

  public BankAccount() {

  }

  public BankAccount(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    if (balance >= 0) {
      this.balance = balance;
    } else {
      throw new IllegalArgumentException("Khoi tao so du am: " + balance);
    }

  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setaccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public double getBlance() {
    return balance;
  }

  public void deposit(double amount) throws IllegalArgumentException {
    if (amount <= 0) {
      throw new IllegalArgumentException("So tien nhap phai lon hon 0: " + amount);
    } else {
      balance += amount;
      System.out.println("Ban vua them: " + amount + ", tai khoan hien tai co: " + balance);
    }
  }

  public void withdraw(double amount) throws IllegalArgumentException, WithdrawException {
    if (amount <= 0) {
      throw new IllegalArgumentException("So tien nhap phai lon hon 0: " + amount);
    } else if (amount > 0 && amount <= balance) {
      this.balance -= amount;
      System.out.println("Ban vua rut: " + amount + ", so du hien tai la: " + balance);
    } else {
      throw new WithdrawException(amount);
    }
  }

  public double checkBalance() {
    return balance;
  }

}
