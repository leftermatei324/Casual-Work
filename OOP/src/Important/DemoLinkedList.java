package Important;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
         LinkedList<Integer> languages = new LinkedList<>();

         languages.add(4);
         languages.add(2);
         languages.add(0);

         //languages.remove(0);

         languages.pop();

        System.out.println(languages);

    }
}
