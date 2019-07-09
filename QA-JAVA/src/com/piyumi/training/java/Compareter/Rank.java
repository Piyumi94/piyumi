package com.piyumi.training.java.Compareter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Rank {

    public static void main(String[] args) {
        sort();
    }


    public static void sort(){
        List<Student> students = Student.getAllStudents();
        System.out.println(students);
        Collections.sort(students, new StudentRanker());
        System.out.println(students);
    }

    public static void sortLamda(){
        Comparator<Student> studentComparator=(s1,s2)->
                (s1.getMarks()<s2.getMarks())?-1:(s1.getMarks()>s2.getMarks())?1:0;
    }

}
