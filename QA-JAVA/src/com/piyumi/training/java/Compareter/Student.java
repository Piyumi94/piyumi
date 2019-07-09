package com.piyumi.training.java.Compareter;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    String name;
    float marks;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static List<Student> getAllStudents() {

        List<Student> student = new ArrayList();

        student.add(new Student("saman", 67));
        student.add(new Student("kamal", 56));
        student.add(new Student("nimal", 76));
        student.add(new Student("samanthi", 79));
        student.add(new Student("samanthi", 79));
        student.add(new Student("kasun", 59));
        student.add(new Student("nihal", 91));
        student.add(new Student("sunil", 49));
        student.add(new Student("ajith", 26));
        student.add(new Student("kasun", 63));
        student.add(new Student("manel", 77));
        return student;
    }


}
