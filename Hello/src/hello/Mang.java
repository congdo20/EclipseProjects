package hello;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mang {
	public static void main(String[] args) {
		
		int[] arrInt = new int[100];
		arrInt[0] = 10;
		System.out.println(arrInt[0]);
		
		char[] arrChar = {'A', 'B', 'C'};
		System.out.println(arrChar[0]);
		
		
		char cha = ' ';
		try {
			cha = (char)System.in.read();
		} catch (Exception e) {
			System.out.println("Nhập lỗi!");
		}
		System.out.println("Ký tự vừa nhập: " + cha);
		
		
		
		int n = 0;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s;
			s = in.readLine();
			n = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println("Nhap du lieu bi loi!");
		}
		System.out.println("Ban vua nhap so: " + n);
		
		
		String str1 = "Java la lua chon so mot cho lap trinh web";
		String str2 = new String(str1);
		String str3 = "Java ho tro doi tuong String de xu ly chuoi";
		
		int result, index;
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		System.out.println("Chieu dai cua chuoi str1 la: " + str1.length());
		for(int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println();
		if(str1.equals(str2)) {
			System.out.println("Chuoi str1 giong chuoi str2.");
		} else {
			System.out.println("Chuoi str1 khac chuoi str2.");
		}
		
		if(str1.equals(str3)) {
			System.out.println("Chuoi str1 giong chuoi str3.");
		} else {
			System.out.println("Chuoi str1 khac chuoi str3.");
		}
		
		result = str1.compareTo(str3);
		if (result == 0) {
			System.out.println("chuoi str1 bang chuoi str3");
		} else {
			if (result < 0) {
				System.out.println("chuoi str1 nho hon chuoi str3.");
			} else {
				System.out.println("chuoi str1 lon hon chuoi str3.");
			}
		}
		
		
		String str4 = "Mot Hai Ba Mot";
		index = str4.indexOf("Mot");
		System.out.println("str4: " + str4);
		System.out.println("Vi tri xuat hien dau tien cua chuoi con \"Mot\" trong str4: " + index);
		index = str4.lastIndexOf("Mot");
		System.out.println("Vi tri xuat hien sau cung cua chuoi con \"Mot\" trong str4: " + index);
		System.out.println();
		
		
		
		System.out.println("*** CHUONG TRINH IN CHUOI NGUOC. ***");
		try {
			System.out.println(" \n Nhap chuoi: ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// class BufferedReader cho phep doc text tu luong nhap ky tu,
			// tao bo dem cho ky tu de ho tro cho viec doc ky tu, mang hay dong 
			// doc 1 dong tu BufferedReader ket thuc bang dau ket thuc dong 
			
			String str = in.readLine();
			System.out.println("Chuoi vua nhap la: " + str);
			
			// xuat chuoi nghich dao
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		String orgstr = "Mot Hai Ba Bon";
		// lay chuoi con dung ham
		// public String substring(int beginIndex, int endIndex)
		String substr = orgstr.substring(0,3); 
		System.out.println("Chuoi goc: " + orgstr);
		System.out.println("Chuoi con: " + substr);
		
		
		
		String str[] = {"Mot", "Hai", "Ba", "Bon"};
		System.out.println("Mang goc: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		System.out.println("\n");
		str[0] = "Bon";
		str[1] = "Ba";
		str[2] = "Hai";
		str[3] = "Mot";
		
		System.out.println("Mang thay doi: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		
		
		
		
	}
}
