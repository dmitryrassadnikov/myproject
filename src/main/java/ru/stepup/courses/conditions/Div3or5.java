/*
#8.1.Тридцать пять. Дана следующая сигнатура метода:

public static boolean is35(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если число x делится нацело на 3 или 5.
Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: true
Пример 2:
x=8
результат: false
Пример 3:
x=15
результат: false
 */

package ru.stepup.courses.conditions;

public class Div3or5 {
    public static void main(String[] args) {
        System.out.println(div3or5(5));
        System.out.println(div3or5(8));
        System.out.println(div3or5(15));
    }

    public static boolean div3or5(int x) {
        boolean res = (x % 3 == 0) || (x % 5 == 0);
        return res;
    }

}

