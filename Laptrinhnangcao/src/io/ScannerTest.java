package io;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class ScannerTest {
  public static void main(String[] args) throws Exception {
	  File file = new File("src/exception/file.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.out.println(file.getAbsolutePath());
    }

    try (PrintWriter output = new PrintWriter(file)) {
      output.println("Nguyen Cong Trinh Do 10");
      output.println("Trinh Do 9");
    }

    Scanner input = new Scanner(file);

    while (input.hasNextLine()) {
      String line = input.nextLine();

      Scanner lineScanner = new Scanner(line);
      String name = "";
      while (lineScanner.hasNext()) {
        if (lineScanner.hasNextInt()) { // Kiểm tra nếu gặp số nguyên
          int number = lineScanner.nextInt(); // Đọc số nguyên
          System.out.println("Name: " + name.trim() + ", Number: " + number);
        } else {
          name += lineScanner.next() + " "; // Ghép từng phần của tên
        }
      }
      lineScanner.close();
    }
    input.close();

    Scanner input1 = new Scanner(file);

    while (input1.hasNextLine()) {
      String line = input1.nextLine();
      Scanner lineScanner = new Scanner(line);

      String name = "";
      int number = -1; 

      while (lineScanner.hasNext()) {
        if (lineScanner.hasNextInt()) {
          number = lineScanner.nextInt(); 
        } else {
          name += lineScanner.next() + " ";
        }
      }

      if (number != -1) { 
        System.out.println(name.trim() + " " + number);
      } else {
        System.out.println("Không tìm thấy số trong dòng: " + name);
      }

      lineScanner.close();
    }
    input1.close();
  }
}
