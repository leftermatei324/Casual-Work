package Test;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"Ana", 9.5));
        students.add(new Student(2,"Ion", 8.0));
        students.add(new Student(1,"Maria", 9.5));
        students.add(new Student(3,"Paul", 7.0));
        students.add(new Student(4,"Elena", 10.0));
        students.add(new Student(2,"George", 8.0));
        students.add(new Student(5,"Diana", 6.5));

        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(students);

        Student max = students.get(0);
        for (Student s : students){
            if (s.getGrade() > max.getGrade()){
                max = s;
            }
        }
        System.out.println(max);

        for (int i = 0; i < students.size(); i ++){
            for (int j = i+1; j<students.size();j++){
                if (students.get(i).equals(students.get(j))) {
                    students.remove(j);
                    j--;
                }
            }
        }
        System.out.println(students);

        Map<Double, List<Student>> map = new HashMap<>();
        for (Student s : students){
            double grade = s.getGrade();

            if(!map.containsKey(grade)){
                map.put(grade, new ArrayList<>());
            }
            map.get(grade).add(s);
        }

        System.out.println(map);

        System.out.println(students);



    }
}
