package com.piyumi.training.java.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

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

        student.forEach(Student -> {
            System.out.println("Name :" + Student.getName() + "Marks :" + Student.getMarks());
        });

        // retrive number of student
        List<Student> students = Student.getAllStudents();
        System.out.println(student.size());

            List<Student> students1 = new ArrayList<>();
            for (Student student1 : students) {
                if (student1.getMarks() > 50) {
                    students1.add(student1);
                }
            }
        System.out.println(students1.size());
    }
}


//find a student who has name with letter i