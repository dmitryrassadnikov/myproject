/*
#8.Тридцать пять. Дана следующая сигнатура метода:

public static boolean is35(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то вернуть надо false. Подсказка: оператор % позволяет получить остаток от деления.

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

public class Is35 {
    public static void main(String[] args) {
        System.out.println(is35(5));
        System.out.println(is35(8));
        System.out.println(is35(15));
    }
    public static boolean div3or5(int x) {
        boolean res = (x % 3 == 0) || (x % 5 == 0);
        return res;
    }
    public static boolean div3and5(int x) {
        boolean res = (x % 3 == 0) && (x % 5 == 0);
        return res;
    }
    public static boolean is35(int x) {
        if (div3and5(x)) {
            return false;
        } else if (div3or5(x)) {
            return true;
        }
        return false;
    }
}