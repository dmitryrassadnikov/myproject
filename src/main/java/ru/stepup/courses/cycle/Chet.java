/*
#3.Четные числа. Дана следующая сигнатура метода:

public static String chet(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все четные числа от 0 до x (включительно). Подсказа для обеспечения качества кода: инструкцию if использовать не следует.

Пример:
x=9
результат: “0 2 4 6 8”
 */

package ru.stepup.courses.cycle;

public class Chet {
    public static void main(String[] args) {
        System.out.println(chet(9));
    }

    public static String chet(int x) {
        for (int i = 0; i <= x; i += 2) {
            System.out.print(i + " ");
        }
        return "";
    }
}