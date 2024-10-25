package salary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileDouble {
    public static void main(String[] args) {
        String fileName = "Ass5_Ex4.dat";
        Random random = new Random();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for(int i = 0; i < 100; i ++) {
                double randNum = 100.0 * random.nextDouble();
                dos.writeDouble(randNum);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        double sum = 0.0;
        int count = 0;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            while(dis.available() > 0) {
                sum += dis.readDouble();
                count++;
            }
        } catch ( IOException e) {
            System.out.println(e.getMessage());
        }

        if(count > 0) {
            double average = sum / count;
            System.out.println("Gia tri trun binh la: " + average);
        } else {
            System.out.println("Khong cos du lieu duoc ghi");
        }


    }
}
