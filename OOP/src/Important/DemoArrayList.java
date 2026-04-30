package Important;

import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> students = new java.util.ArrayList<>();

        students.add("Ana");
        students.add("Cameliu");
        students.add("Ionut");

        students.remove("Ana");
        System.out.println(students.isEmpty());

        System.out.println(students);
    }
}
