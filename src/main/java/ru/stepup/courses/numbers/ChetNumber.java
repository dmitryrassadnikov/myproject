package ru.stepup.courses.classesandmethods;

public class ChetNumber {
    public static void main(String[] args) {
        System.out.println(chetNumber(12));
    }

    public static int chetNumber(int x) {
        System.out.println(x > 0);
        boolean chet = (x % 2 == 0);
        boolean dif = (x < 13);
        System.out.println(chet);
        System.out.println(dif);
        System.out.println(chet ^ dif);
        System.out.println(chet || dif);
        System.out.println(chet && dif);
        return x;

    }
}