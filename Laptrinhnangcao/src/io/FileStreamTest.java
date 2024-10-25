package io;

import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/trinhdo/Documents/EclipseProjects/Laptrinhnangcao/src/io/file.dat");
        
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            System.out.println("File created.");
        }

        try (FileOutputStream output = new FileOutputStream(file, true)) {
            for (int i = 1; i <= 1000; i++) {
                output.write(i);
            }
        }

        try (FileInputStream input = new FileInputStream(file)) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("/Users/trinhdo/Documents/EclipseProjects/Laptrinhnangcao/src/exception/file.txt"))) {
            output.writeUTF("Nguyen");
            output.writeUTF("Cong");
            output.writeUTF("Trinh");
            output.writeUTF("Do");
            output.writeDouble(10.0);
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("/Users/trinhdo/Documents/EclipseProjects/Laptrinhnangcao/src/exception/file.txt"))) {
            System.out.println();
            System.out.println(input.readUTF() + " " + input.readUTF() + " " + input.readUTF() + " " + input.readUTF() + " " + input.readDouble());
        }
    }
}
