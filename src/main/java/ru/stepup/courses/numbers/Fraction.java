/*
#1.Дробная часть. Дана следующая сигнатура метода:

public static double fraction(double x);
Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х. При выводе результата необходимо обеспечить точность вычислений — три знака после запятой Подсказка: вещественное число может быть преобразовано к целому путем отбрасывания дробной части.

Пример:
x=5,3
результат: 0,3
*/

package ru.stepup.courses.classesandmethods;


public class Fraction {
    public static void main(String[] args) {
        System.out.printf("%.3f", fraction(5.365845));
    }

    public static double fraction(double x) {
        int x1 = (int) x;
        double res = x - x1;
        return res;
    }
}
