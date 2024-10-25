package tuan5b3;

public class SavingsAccount extends BankAccount {
  private static final double MIN_BALANCE = 500;
  private static final double PENALTY = 50;
  private double interestRate;

  public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
    super(accountNumber, accountHolderName, balance);
    this.interestRate = interestRate;

  }

  @Override
  public void withdraw(double amount) throws WithdrawException {
    super.withdraw(amount);
    if (balance < MIN_BALANCE) {
      balance -= PENALTY;
      System.out.println("So du duoi muc toi thieu, bi phat: " + PENALTY + ". So du hien tai: " + getBalance());
    }
  }

  public void applyInterest() {
        double interest = getBalance() * interestRate / 100; // Giả sử interestRate là tỷ lệ phần trăm
        deposit(interest); // Giả sử có phương thức deposit trong BankAccount
        System.out.println("Lãi suất được áp dụng: " + interest + ". Số dư sau khi áp dụng lãi: " + getBalance());
  }

}
