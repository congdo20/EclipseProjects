package salary;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WriteFileExistsBinary {
    public static void main(String[] args) {
        String fileName = "Ass5_Ex3.dat";
        File file = new File(fileName);

        try {
            if(!file.exists()) {
                System.out.println("File khong ton tai, tao file moi.");
                file.createNewFile();
            } else {
                System.out.println("File da ton tai, ghi tiep vao file");
            }

            try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file, true))) {
                Random ran = new Random();
                for (int i = 0; i < 150; i++) {
                    int numberRandom = ran.nextInt(101);
                    out.writeInt(numberRandom);
                }
            }

            System.out.println("Ghi thanh cong so dang nhi phan");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    
    }
}
