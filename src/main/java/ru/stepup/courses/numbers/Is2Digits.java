/*
#5.Двузначное. Дана следующая сигнатура метода:

public static boolean is2Digits(int x);
Необходимо реализовать метод таким образом, чтобы он принимал положительное число x и возвращал true если оно двузначное.

Пример 1:
x=32
результат: true
Пример 2:
x=516
результат: false
 */

package ru.stepup.courses.classesandmethods;

public class Is2Digits {
    public static void main(String[] args) {
        System.out.println(is2Digits(32));
        System.out.println(is2Digits(516));
    }

    public static boolean is2Digits(int x) {
        boolean res = (x>=10) && (x<=99);
        return res;
    }
}