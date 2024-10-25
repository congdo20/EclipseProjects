package salary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteFileExists {
    public static void main(String[] args) {
        String fileName = "Ass5_Ex2.txt";
        File file = new File(fileName);
        
        try {
            if(!file.exists()) {
                System.out.println("Tep khong ton tai, tao tep moi");
                file.createNewFile();
            } else {
                System.out.println("Tep da ton tai, ghi tiep tu cuoi file");
            }  

            try (FileWriter writer = new FileWriter(file, true)){
                Random rand = new Random();
                int count = 0;

                for(int i = 0; i < 150; i++) {
                    int randomNumber = rand.nextInt(101);
                    writer.write(randomNumber + " ");

                    count++;
                    if(count == 10) {
                        writer.write("\n");
                        count = 0;
                    }

                }

            }
        
            System.out.println("Ghi thanh cong!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
