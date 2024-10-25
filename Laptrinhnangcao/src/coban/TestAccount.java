package coban;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1012, 20000000);
		Account.setAnnualInterestRate(4.5 / 100.0);
		
		
		account.withdraw(1500000);
		account.deposit(3000000);
		System.out.println("So du hien tai: " + account.getBalance());
		System.out.println("Tien lai hang thang: " + account.getMonthlyInterest());
		System.out.println("Ngay tao tai khoan: " + account.getDateCreated());		
	}
}
