package javalang;

public class ObjectDemo {
    public static void main(String args[]) {
        // Kiểm tra nếu có ít nhất một tham số được truyền vào
        if (args.length > 0 && args[0].equals("Aptech")) {
            System.out.println("Yes, Aptech is the right choice!");
        } else {
            System.out.println("No arguments or incorrect argument provided.");
        }
    }
}
