package generic;

public class WildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("The max number is " + max(intStack));
    }

    public static double max(GenericStack<? extends Number> stack) {
        // <?> tuong duong voi <? extends Object>
        double max =  stack.pop().doubleValue();
        while(!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if(value > max)
                max = value;
        }
        return max;
    }
}
