package com.piyumi.training.java.ArrayList;

import java.util.Comparator;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {

        Optional<Student> student = Student.getAllStudents().stream()
                .max(Comparator.comparing(Student::getMarks));
        System.out.println(student);


        Optional<Student> student1 = Student.getAllStudents().stream()
                .min(Comparator.comparing(Student::getMarks));
        System.out.println(student1);
    }
}
