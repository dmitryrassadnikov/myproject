/*
#7.Двойная сумма. Дана следующая сигнатура метода:

public static int sum2(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал сумму чисел x и y. Однако, если сумма попадает в диапазон от [10, 19], то надо вернуть число 20.

Пример 1:
x=5  y=7
результат: 20
Пример 2:
x=8  y=-1
результат: 7
 */

package ru.stepup.courses.conditions;

public class Sum2 {
    public static void main(String[] args) {
        System.out.println(sum2(5, 7));
        System.out.println(sum2(8, -1));
    }

    public static boolean range(int x, int y) {
        boolean res = ((x + y) >= 10) && ((x + y) <= 19);
        return res;
    }

    public static int sum2(int x, int y) {
        if (range(x, y)) {
            return 20;
        }
        return x + y;
    }
}