package io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class WriteData {
    public static void main(String[] args) throws IOException {  
        File file = new File("scores.txt");
        if(file.exists()) {
            System.out.println("File already exists");
        }
        
        try (PrintWriter output = new PrintWriter(file)) {
            output.print("Nguyen Van A ");
            output.println(9);
            output.print("Nguyen Van B ");
            output.println(8);
        }

        double sum = 0;
        int count = 0;
        Scanner input = new Scanner(file);
        while(input.hasNext()) {
            String firstName = input.next();
            String midName = input.next();
            String lastName = input.next();
            //String strScore = input.next();
            //int score = Integer.parseInt(strScore);
            int score = input.nextInt();
            sum += score;
            count++;
            System.out.println(firstName + " " + midName + " " + lastName);
            System.out.println("Score: " + score);
        }
        System.out.println("Score trung binh: " + sum / count);


        input.close();
    }
}
