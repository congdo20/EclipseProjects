package salary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculateSalary {
    public static void main(String[] args) {
         String fileName = "Salary.txt";
        double assistantTotal = 0.0;
        double teacherTotal = 0.0;
        double associateTotal = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(" ");
                if (data.length == 4) {
                    String rank = data[2];
                    double salary = Double.parseDouble(data[3]);

                    switch (rank) {
                        case "assistant":
                            assistantTotal += salary;
                            break;
                        case "teacher":
                            teacherTotal += salary;
                            break;
                        case "associate":
                            associateTotal += salary;
                            break;
                    }
                }
            }

            System.out.printf("Tong luong o chuc vu assistant: %.2f\n", assistantTotal);
            System.out.printf("Tong luong o chuc vu teacher: %.2f\n", teacherTotal);
            System.out.printf("Tong luong o chuc vu associate: %.2f\n", associateTotal);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
