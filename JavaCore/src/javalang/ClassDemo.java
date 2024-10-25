package javalang;

public class ClassDemo {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		
		Class<?> x;
		
		x = a.getClass();
		System.out.println("a is object of type: " + x.getName());

		x= b.getClass();
		System.out.println("b is object of type: " + x.getName());
		
		x=x.getSuperclass();
		System.out.println(x.getName() + "is the superclass of b.");
	}
}
