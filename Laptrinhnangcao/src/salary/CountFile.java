package salary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap duong dan tep: ");
        String filePath =  sc.nextLine();
        //  /Users/trinhdo/Documents/EclipseProjects/Laptrinhnangcao/src/salary/scores.txt
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("[\\s.,!?;:()\\[\\]{}\"']+");
                wordCount += words.length;
                
                // neu dong taon dau cach hoac dau cau
                if(words.length == 1 && words[0].isEmpty()) {
                    wordCount--;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
        System.out.println("So dong: " + lineCount);
        System.out.println("So chu: " + wordCount);
        System.out.println("So ky tu: " + charCount);



    }
}
