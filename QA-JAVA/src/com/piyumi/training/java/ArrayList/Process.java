package com.piyumi.training.java.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Process {

    public static void main(String[] args) {
        way1();
        System.out.println("===========================");

        way2();
        System.out.println("===========================");

        way3();
        System.out.println("===========================");


      // another way to print all records as a list than way1, way2, way3
      Student.getAllStudents().stream().
      forEach(System.out::println);


    }

    public static void way1(){
        List<Student> students = Student.getAllStudents().stream()
                .map(s->new Student("Eng :" +s.getName(), s.getMarks()))
                .collect(Collectors.toList());

        for(Student student: students){
            System.out.println(student.getName() +" " + student.getMarks());
        }

    }

    public static void way2(){
        List<Student> students1 = Student.getAllStudents().stream()
                .filter(s->s.getMarks()>75)
                .map(s->new Student("Eng :" +s.getName(), s.getMarks()))
                .collect(Collectors.toList());


        for(Student student: students1){
            System.out.println(student.getName() +" " + student.getMarks());
        }
    }

    public static void way3() {
        long count = Student.getAllStudents().stream()
                .map(s->new Student("Eng :" +s.getName(), s.getMarks()))
                .count();

        System.out.println(count);
    }
    }

