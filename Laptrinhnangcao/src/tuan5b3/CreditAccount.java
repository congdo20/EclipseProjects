package tuan5b3;

public class CreditAccount extends BankAccount {
  private double creditLimit;
  private double interestRate;

  public CreditAccount(String accountNumber, String accountHolderName, double balance, double creditLimit,
      double interestRate) {
    super(accountNumber, accountHolderName, balance);
    this.creditLimit = creditLimit;
    this.interestRate = interestRate;
  }

  @Override
  public void withdraw(double amount) throws WithdrawException {
    if (balance - amount < -creditLimit) {
      throw new WithdrawException("So du vuot qua han muc tin dung.");
    } else {
      balance -= amount;
      System.out.println("Rut tien thanh cong, So du hien tai: " + getBalance());
    }
  }

  public void applyInterest() {
    double interest = getBalance() * interestRate / 100; // Giả sử interestRate là tỷ lệ phần trăm
    deposit(interest); // Giả sử có phương thức deposit trong BankAccount
    System.out.println("Lãi suất được áp dụng: " + interest + ". Số dư sau khi áp dụng lãi: " + getBalance());
  }
}
