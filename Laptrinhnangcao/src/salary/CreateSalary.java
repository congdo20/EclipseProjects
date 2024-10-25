package salary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateSalary {
    public static void main(String[] args) {
        String fileName = "salary.txt";
        String[] ranks = {"assistant", "teacher", "associate"};
        Random random = new Random();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= 1000; i ++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;

                String rank = ranks[random.nextInt(ranks.length)];
                double salary = 0.0;

                switch(rank) {
                    case "assistant":
                        salary = 50000 + (random.nextDouble() * (30000));
                        break;
                    case "teacher":
                        salary = 60000 + (random.nextDouble() * (50000));
                        break;
                    case "associate":
                        salary = 75000 + (random.nextDouble() * 55000);
                        break;
                }

                writer.write(firstName + " " + lastName + " " + rank + " " + String.format("%.2f", salary));
                writer.newLine();
            }
            System.out.println("Tao tep " + fileName + "thanh cong");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
