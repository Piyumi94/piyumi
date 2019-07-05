package com.piyumi.training.java.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {

        List<Student> students = Student.getAllStudents().stream()
                .sorted((s1,s2)->new Integer(s1.getName().length())
                        .compareTo(s2.getName().length())).collect(Collectors.toList());
        System.out.println(students);


        List<Student> students1 = Student.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(students1);
    }
}
