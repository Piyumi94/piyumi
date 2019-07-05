package com.piyumi.training.java.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// in filter lr <= lo(count should be less than or equal original list)

public class Filter {

    public static void main(String[] args) {
        withoutStrem();
        Stream();
        Noletter();
        Names();
    }

    public static void withoutStrem(){
        List<Student> students = Student.getAllStudents();
        List<Student> students1 = new ArrayList<>();
        for (Student student1 : students) {
            if (student1.getMarks() > 50) {
                students1.add(student1);
            }
        }
        System.out.println(students1.size());
    }

    public static void Stream(){

        List<Student> students1 = Student.getAllStudents().stream().filter(s -> s.getMarks() > 50).collect(Collectors.toList());
        System.out.println(students1.size());
    }

    public static void Noletter(){
        List<Student> students2 = Student.getAllStudents().stream().filter(s1->s1.getName().contains("i")).collect(Collectors.toList());
        System.out.println(students2.size());
    }

    public  static void Names(){
        Student.getAllStudents().stream().filter(s1->s1.getName().contains("i")).forEach(std-> System.out.print(std.getName()+", "));

    }
}
