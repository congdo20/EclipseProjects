package generic;

public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Object> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        print(intStack);

        GenericStack<String> stack2 = new GenericStack<>();
        stack2.push("Hello");
        stack2.push("World!");
        add(stack2, intStack);
        print(intStack);
    }

    public static void print(GenericStack<?> stack) {
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static <T> void add(GenericStack<? extends T> stack1, GenericStack<? super T> stack2) {
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

}
