package tuan5b3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      BankAccount savings = new SavingsAccount("1", "Nguyen", 1000, 0.03);
      BankAccount checking = new CheckingAccount("2", "Cong", 5000);
      BankAccount credit = new CreditAccount("3", "Trinh Do", 0, 5000, 0.05);

      System.out.print("Nhap so tien nap vao tai khoan tiet kiem: ");
      savings.deposit(input.nextDouble());

      System.out.print("Nhap so tien can rut tu tai khoan vang lai: ");
      checking.withdraw(input.nextDouble());

      System.out.print("Nhap so tien rut tu tai khoan tin dung: ");
      credit.withdraw(input.nextDouble());

    } catch (InputMismatchException e) {
      System.out.println("Loi nahp so lieu khong dung kieu so.");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } catch (WithdrawException e) {
      System.out.println(e.getMessage());
    } finally {
      input.close();
    }
  }
}
