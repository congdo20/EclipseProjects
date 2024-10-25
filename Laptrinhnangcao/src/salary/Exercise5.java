package salary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Exercise5 {
    public static void main(String[] args) {
        String fileName = "Ex5.dat";

        int[] intArray = {1, 2, 3, 4, 5};
        Date currentDate = new Date();
        double doubleVal = 5.5;

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for(int value : intArray) {
                dos.writeInt(value);
            }

            dos.writeLong(currentDate.getTime());

            dos.writeDouble(doubleVal);

        } catch(IOException e ) {
            System.out.println(e.getMessage());
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.print("Mang int: " );
            for(int i = 0; i < intArray.length; i++) {
                int value = dis.readInt();
                System.out.print(value + " ");
            }
            System.out.println();
            long dateMiliSec = dis.readLong();
            Date date = new Date(dateMiliSec);
            System.out.println("Thoi gian hien tai: " + date);

            double readDouVal = dis.readDouble();
            System.out.println("Gia tri double: " + readDouVal);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
