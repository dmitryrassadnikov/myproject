/*
#4.Есть ли позитив. Дана следующая сигнатура метода:

public static boolean isPositive(int x);
  Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.

Пример 1:
x=3
результат: true
Пример 2:
x=-5
результат: false
 */


package ru.stepup.courses.numbers;

public class IsPositive {
    public static void main(String[] args) {
        System.out.println(isPositive(3));
        System.out.println(isPositive(-5));
    }

    public static boolean isPositive(int x) {
        boolean res = (x > 0);
        return res;
    }
}