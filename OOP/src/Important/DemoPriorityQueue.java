package Important;

import java.util.PriorityQueue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();

        numbers.add(67);
        numbers.add(69);
        numbers.add(420);
        numbers.add(666);
        numbers.add(777);

        System.out.println(numbers);

        while (!numbers.isEmpty()){
            System.out.println(numbers.poll() + " ");
        }
    }
}
