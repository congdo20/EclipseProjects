package tuan5b3;

public class CheckingAccount extends BankAccount {
  private static final double DAILY_LIMIT = 2000;
  private double dailyWithdraw;

  public CheckingAccount(String accountNumber, String accountHolderName, double balance) {
    super(accountNumber, accountHolderName, balance);
    this.dailyWithdraw = 0;
  }

  @Override
  public void withdraw(double amount) throws WithdrawException {
    if (amount + dailyWithdraw > DAILY_LIMIT) {
      throw new WithdrawException("So tien rut vuot qua han muc hang ngay.");
    } else {
      super.withdraw(amount);
      dailyWithdraw += amount;
    }
  }
}
