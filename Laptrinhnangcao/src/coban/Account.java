package coban;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualrate) {
        annualInterestRate = annualrate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("So tien rut phai lon hon 0.");
        } else if (money > balance) {
            System.out.println("So du hien tai khong du.");
        } else {
            this.balance -= money;
            System.out.println("Rut tien thanh cong: " + money);
        }
    }

    public void deposit(double money) {
        if (money <= 0) {
            System.out.println("So tien gui phai lon hon 0.");
        } else {
            balance += money;
            System.out.println("Gui tien thanh cong: " + money);
        }
    }

}
