package tuan5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      BankAccount account1 = new BankAccount("1", "Nguyen", 10000);
      System.out.println("Tao tai khoan thanh cong.");
      /*
      BankAccount account2 = new BankAccount("2", "Cong", 100000);
      System.out.println("Tao tai khoan thanh cong.");
      BankAccount account3 = new BankAccount("3", "Trinh Do", 1000000);
      System.out.println("Tao tai khoan thanh cong.");
      */
      try {
        System.out.print("Nhap so tien ban muon them: ");
        account1.deposit(input.nextDouble());
        System.out.println("");

        System.out.print("Nhap so tien ban muon rut: ");
        account1.withdraw(input.nextDouble());
        System.out.println();

      } catch (InputMismatchException e) {
        System.out.println("Du lieu nhap khong hop le, vui long nhap lai: ");
        input.nextLine();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      } catch (WithdrawException e) {
        System.out.println(e.getMessage());
      }

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } finally {
      input.close();
    }

  }
}
