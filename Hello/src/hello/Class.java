package hello;

public class Class {
	public static void main(String[] args) {
		OldVer[] ov = new OldVer[2];
		NewVer nv = new NewVer();
		ov[0] = nv;
		ov[1] = new OldVer();
		
		OldVer nv1;
		for(int i = 0; i < 2; i++) {
			nv1 = ov[i];
			System.out.println(nv1.Sum(9, 9));
		}
		
		
		
	}
	
	//
	static class OldVer { // lop noi 
		
		public OldVer() {
			
		}
		
		public int Sum(int a, int b) {
			return a + b;
		}
		public double Sum(double a, double b) {
			return a + b;
		}
		
		
	}
	
	//	
	static class NewVer extends OldVer {
		public NewVer() {
			
		}
		
		public int Sum(int a, int b) {
			return a * b;
		}

	}
	
	//
	abstract class Abstr { // lop truu tuong
		abstract void method_1(int a, int b);
	}
	
	//
	public class Abstr1 extends Abstr {
		public void method_1(int a, int b) {
			System.out.println("Hello");
		}
	}
		
	//
	public class Abstr2 extends Abstr {
		public void method_1(int a, int b) {
			System.out.println("Hehe");
		}
	}
	
	//
	public final class Constants {
		public final int x = 100;
		public final void method1() {
			
		}
		public final void method2() {
			
		}
	}
	
	
	//
	protected void finalize() {
		
	}
	
}

