package ru.stepup.courses.ooppolim;


public class StartNumber {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);
        Fraction result = f1.sum(f2).sum(f3);
        System.out.println(result);
    }
}
