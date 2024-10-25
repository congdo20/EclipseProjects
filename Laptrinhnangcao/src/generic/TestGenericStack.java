package generic;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Ha Noi");
        stack1.push("Hue");
        stack1.push("Da Nang");
        stack1.push("Ho Chi Minh");
        System.out.println("stack1: " + stack1);

        String str = stack1.pop();
        System.out.println(str + " is pop from stack1");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        System.out.println("stack2: " + stack2);

        int i = stack2.pop();
        System.out.println(i + " is pop from stack2");


    }
}
