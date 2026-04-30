package Important;

import java.util.Stack;

public class DemoStackVector {
    public static void main(String[] args) {
        Stack<Double> prices = new Stack<>();

        prices.add(6.7);
        prices.add(6.9);
        prices.add(4.201);

        //prices.pop();
        System.out.println(prices.peek());

        System.out.println(prices);
    }
}
