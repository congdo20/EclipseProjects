package tuan5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Product product = new Product("1", "Laptop", 100, 2000);
            System.out.println("Tao san pham thanh cong!");

            try {
                System.out.print("Nhap so luong de them vao kho: ");
                int amountToAdd = scanner.nextInt();
                product.addStock(amountToAdd);
                System.out.println("So luong hien tai sau khi them: " + product.getQuantity());
            } catch (InputMismatchException e) {
                System.out.println("Du lieu khong hop le! Vui long nhap so nguyen cho so luong.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                System.out.print("Nhap so luong de rut khoi kho: ");
                int amountToRemove = scanner.nextInt();
                product.removeStock(amountToRemove);
                System.out.println("So luong hien co sau khi rut: " + product.getQuantity());
            } catch (InputMismatchException e) {
                System.out.println("Du lieu khong hop le! Vui long nhap so nguyen cho so luong.");
                scanner.nextLine();
            } catch (RemoveStockException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
