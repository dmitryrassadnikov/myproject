/*
#9.Равенство. Дана следующая сигнатура метода:

public static boolean isEqual (int a, int b, int c);
Необходимо реализовать метод таким образом, чтобы он возвращал true если все три полученных методом числа равны

Пример 1:
a=3 b=3 с=3
результат: true
Пример 2:
a=2 b=15 с=2
результат: false
 */

package ru.stepup.courses.numbers;

public class IsEqual {
    public static void main(String[] args) {
        System.out.println(isEqual(3, 3, 3));
        System.out.println(isEqual(2, 15, 2));

    }

    public static boolean isEqual(int a, int b, int c) {
        boolean res = (a == b) && (b == c) && (a == c) ;
        return res;
    }
}