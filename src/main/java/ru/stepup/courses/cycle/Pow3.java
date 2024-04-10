/*
#4.Степень числа. Дана следующая сигнатура метода:

public static int pow(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.

Подсказка: для получения степени необходимо умножить единицу на число x, и сделать это y раз, т.е. два в третьей степени это 1*2*2*2

Пример:
x=2
y=5
результат: 32
 */

package ru.stepup.courses.cycle;

public class Pow3 {
    public static void main(String[] args) {
        int res = 1;
        int x = 2;
        int y = 5;
        for (int i = 1; i <= y; i++) {
            res = res * x;
        }
        System.out.println(res);
    }
}