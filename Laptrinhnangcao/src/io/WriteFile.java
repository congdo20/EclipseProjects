package io;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
  public static void main(String[] args) throws IOException {
    File file = new File("src/exception/file.txt");

    // Ghi đè tệp nếu nó đã tồn tại
    try (PrintWriter output = new PrintWriter(file)) {
      output.print("Trinh Do ");
      output.println(10);
      output.print("Trinh Do ");
      output.println(9);
    }

    // Đọc và in dữ liệu từ tệp
    try (Scanner input = new Scanner(file)) {
      while (input.hasNext()) {
        String name = input.next() + " " + input.next();
        if (input.hasNextInt()) {
          int score = input.nextInt();
          System.out.println("Name: " + name + ", Score: " + score);
        } else {
          System.out.println("Invalid data format for score");
          break;
        }
      }
    }
  }
}
