/*
#8.Делитель. Дана следующая сигнатура метода:

public static boolean isDivisor (int a, int b);
Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из принятых чисел делит другое нацело.

Пример 1:
a=3 b=6
результат: true
Пример 2:
a=2 b=15
результат: false
 */


package ru.stepup.courses.numbers;

public class IsDivisor {
    public static void main(String[] args) {
        System.out.println(isDivisor(3, 6));
        System.out.println(isDivisor(2, 15));

    }

    public static boolean isDivisor(int a, int b) {
        int div = a % b;
        int div1 = b % a;
        boolean res = ((a >= b) && (div == 0)) || ((a <= b) && (div1 == 0));
        return res;
    }
}