/*
#1.Создайте класс Дробь (Fraction) со следующими особенностями:

Имеет числитель (numerator): целое число
Имеет знаменатель (denominator): целое число
Дробь может быть создана с указанием числителя и знаменателя
Объекты дробей не могут изменять свое состояние
Для числителя задать отрицательное значение можно, в этом случае вся дробь считается отрицательной
Для знаменателя отрицательное значение недопустимо
Может вернуть строковое представление вида “числитель/знаменатель” (toString)
Может выполнять операции сложения, вычитания с другой Дробью или целым числом. Результатом операции должна быть новая Дробь
Затем необходимо выполнить следующие задачи:

Создать несколько экземпляров дробей
Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, а f3 это семь восьмых
 */

package ru.stepup.courses.oop;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Для знаменателя нулевое значение недопустимо!");
        } else if (denominator < 0) {
            throw new IllegalArgumentException("Для знаменателя отрицательное значение недопустимо!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }


    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }
}