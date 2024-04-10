/*
#9.Волшебная шестерка. Дана следующая сигнатура метода:

public static boolean magic6(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если одно из принятых методом чисел равно шести, или их сумма равна шести, или разница между ними равна шести.

Пример 1:
x=5  y=7
результат: false
Пример 2:
x=8  y=2
результат: true
Пример 3:
x=1  y=6
результат: true
 */

package ru.stepup.courses.conditions;

public class Magic6 {
    public static void main(String[] args) {
        System.out.println(magic6(5, 7));
        System.out.println(magic6(8, 2));
        System.out.println(magic6(1, 6));
        System.out.println(magic6(2, 4));
    }
    public static boolean six(int x, int y) {
        boolean res = (x == 6) || (y == 6);
        return res;
    }
    public static boolean sumSix(int x, int y) {
        boolean res = (x + y) == 6;
        return res;
    }
    public static boolean difSix(int x, int y) {
        boolean res = (x - y == 6) || (y - x == 6);
        return res;
    }
    public static boolean magic6(int x, int y) {
        if (six(x, y) || sumSix(x, y) || difSix(x, y)) {
            return true;
        }
        return false;
    }
}