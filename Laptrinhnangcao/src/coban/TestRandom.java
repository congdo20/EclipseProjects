package coban;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random(1000); 
        
        System.out.println("50 so ngau nhien tu 1 den 99 la: ");
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100); 
            System.out.print(randomNumber + " ");
        }
    }
}