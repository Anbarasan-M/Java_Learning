package com.practice.fundamentals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    int age;
    String name;

    public Student(int age, String name){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Anbu"));
        students.add(new Student(22, "John"));
        students.add(new Student(23, "Tim"));
        students.add(new Student(24, "Root"));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
