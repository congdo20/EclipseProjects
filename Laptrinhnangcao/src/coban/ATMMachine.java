package coban;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 1000000);
        }

        Scanner sc = new Scanner(System.in);
        int id = enterID(sc);
        if (id != -1) {
            Menu(sc, accounts[id]);
        }
        sc.close();
    }
    

    static boolean checkID(int id) {
        return (id >= 0 && id < 10);
    }
    

    static int enterID(Scanner sc) {
        int id = -1;
        boolean check = false;
        while (!check) {
            System.out.print("Nhap Id cua ban: ");
            id = sc.nextInt();
            check = checkID(id);
            if (!check) {
                System.out.println("Id khong hop le, vui long nhap lai.");
            }
        }
        return id;
    }

    
    static void Menu(Scanner sc, Account account) {
        boolean running = true;
        while (running) {
            System.out.println("---Menu---");
            System.out.println("1. Tra cuu so du");
            System.out.println("2. Rut tien");
            System.out.println("3. Gui tien");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("So du hien tai cua ban la: " + account.getBalance());
                    System.out.println();
                    break;
                case 2:
                	System.out.print("Nhap so tien muon rut: ");
                    double withdrawmoney = sc.nextDouble();
                    account.withdraw(withdrawmoney);
                    System.out.println("So du hien tai cua ban la: " + account.getBalance());
                    System.out.println();
                    break;
                case 3:
                	  System.out.print("Nhap so tien muon gui: ");
                      double depositmoney = sc.nextDouble();
                      account.deposit(depositmoney);
                      System.out.println("So du hien tai cua ban la: " + account.getBalance());
                      System.out.println();
                      break;
                case 4:
                    running = false;
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
                    break;
            }
        }
    }
    
    
}
