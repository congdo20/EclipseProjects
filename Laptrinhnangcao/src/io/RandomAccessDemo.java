package io;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.IOException;
public class RandomAccessDemo{
	public static void main(String[] args) {
		try {
			File file = new File("src/exception/file.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");	
			raf.setLength(0);
			
			for (int i = 0; i < 200; i++) {
				raf.writeInt(i);
			}
			System.out.println("Current file length is: " + raf.length());

			raf.seek(0);
			System.out.println("The first number is: " + raf.readInt());
			
			raf.seek(1 * 4);
			System.out.println("The second number is: "+ raf.readInt());
			
			raf.seek(9 * 4);
			System.out.println("The tenth number is: " + raf.readInt());
			
			raf.writeInt(555);
			raf.seek(raf.length());
			raf.writeInt(999);
			
			System.out.println("The new length is: " + raf.length());
			
			raf.seek(10 * 4);
			System.out.println("The eleventh number is: " + raf.readInt());

			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

