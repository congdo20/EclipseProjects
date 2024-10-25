package coban;
import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Account[] account = new Account[10];
        for (int i = 0; i < 10; i++) {
            account[i] = new Account(i, 1000000);
        }
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap Id cua ban: ");
            int id = sc.nextInt();
            
            if (id < 0 || id >= account.length) {
                System.out.println("Id khong hop le, vui long nhap lai.");
                continue;
            }

            boolean exitMenu = false;
            while (!exitMenu) {
                System.out.println("Menu:");
                System.out.println("1. Xem so du");
                System.out.println("2. Rut tien");
                System.out.println("3. Gui tien");
                System.out.println("4. Thoat");
                
                System.out.print("Chon: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("So du hien tai: " + account[id].getBalance());
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Nhap so tien muon rut: ");
                        double amountToWithdraw = sc.nextDouble();
                        account[id].withdraw(amountToWithdraw);
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Nhap so tien muon gui: ");
                        double amountToDeposit = sc.nextDouble();
                        account[id].deposit(amountToDeposit);
                        System.out.println();
                        break;
                    case 4:
                        exitMenu = true;
                        System.out.println("Dang thoat khoi tai khoan...");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le.");
                        System.out.println();
                }
            }

            System.out.println("Ban co muon thoat khoi chuong trinh? (y/n): ");
            char exitChoice = sc.next().charAt(0);
            if (exitChoice == 'y' || exitChoice == 'Y') {
                break;
            }
        }

        sc.close();
        System.out.println("Chuong trinh da ket thuc.");
    }
}
