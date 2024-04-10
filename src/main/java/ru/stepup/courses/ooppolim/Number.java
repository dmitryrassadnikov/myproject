/*
#5.Имеется класс, описывающий Дробь

class Fraction{
    int num,denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }
}
Сделайте так, чтобы она была подтипом класса Number, который входит в стандартную редакцию языка Java.
Вместо класса, приведенного в задании, можно использовать сделанный ранее самостоятельно класс Дроби.

Обратите внимание, что необходимо будет реализовать набор абстрактных методов класса Number.
Получение всех форм представления Number выполняется делением числителя на знаменатель.
 */

package ru.stepup.courses.ooppolim;

class Fraction extends Number {
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

    public int intValue() {
        return (this.numerator / this.denominator);
    }

    public long longValue() {
        return (long) (this.numerator / this.denominator);
    }

    public float floatValue() {
        return (float) (this.numerator / this.denominator);
    }

    public double doubleValue() {
        return (double) (this.numerator / this.denominator);
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


    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}







