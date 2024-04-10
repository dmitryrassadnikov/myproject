package ru.stepup.courses.oop;

public class StartStudent {
    public static void main(String[] args) {
        Student student = new Student("Петя");
        student.addGrade(3);
        student.addGrade(4);
        student.addGrade(5);
        student.addGrade(2);
        student.addGrade(3);
        System.out.println(student);
    }
}


