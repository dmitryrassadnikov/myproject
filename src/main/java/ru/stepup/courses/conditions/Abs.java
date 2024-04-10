/*
#1.Модуль числа. Дана следующая сигнатура метода:

public static int abs(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х (если он был положительным, то таким и остается, если он был отрицательным – то необходимо вернуть его без знака минус). При реализации метода не использовать методы класса Math.

Пример 1:
x=5
результат: 5
Пример 2:
x=-3
результат: 3
 */

package ru.stepup.courses.conditions;

public class Abs {
    public static void main(String[] args) {
        System.out.println(abs(5));
        System.out.println(abs(-3));
    }

    public static int abs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }
}