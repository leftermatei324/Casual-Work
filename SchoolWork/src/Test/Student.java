package Test;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Cloneable, Comparable<Student>, Serializable {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return (int)(id + grade + name.length());
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.grade, o.grade);
    }
}
