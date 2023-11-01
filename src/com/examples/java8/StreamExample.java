package com.examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Java", 90));
        studentList.add(new Student(2, "Spring", 93));
        studentList.add(new Student(3, "Springboot", 89));
        studentList.add(new Student(4, "Git", 98));
        studentList.add(new Student(5, "Maven", 91));
        studentList.add(new Student(6, "Jenkins", 78));
        studentList.add(new Student(7, "Docker", 85));
        studentList.add(new Student(8, "Microservice", 60));
        studentList.add(new Student(9, "MongoDB", 95));
        studentList.add(new Student(10, "PostgreSQL", 92));
        /*
        studentList.forEach(student->{
            if(student.mathsMarks >= 90){
                System.out.println(student.name);
            }
        });*/

        List<String> filteredStudents =
                studentList.stream()
                .filter(student -> student.mathsMarks >= 90)
                        .map(student -> student.name)
                        .collect(Collectors.toList());

        filteredStudents.forEach(name->{
            System.out.println("Name: "+name);
        });


    }
}
