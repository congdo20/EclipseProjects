package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class SerializableDemo {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng Student với LocalDate
            LocalDate birthday = LocalDate.of(2020, 10, 8); // Ngày sinh 8 tháng 10 năm 2020
            Student std1 = new Student(20203676, "Nguyen Cong Trinh Do", birthday);
            System.out.println("Write object to file: " + std1);
            
            // Tuần tự hóa đối tượng std1 vào tệp
            FileOutputStream fos = new FileOutputStream("src/exception/file.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(std1);
            oos.flush();
            oos.close();

            // Giải tuần tự hóa đối tượng từ tệp
            Student std2;
            FileInputStream fis = new FileInputStream("src/exception/file.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            std2 = (Student) ois.readObject();
            ois.close();

            // In đối tượng sau khi đọc từ tệp
            System.out.println("Read object from file: " + std2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
