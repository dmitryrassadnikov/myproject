/*
#6.Одинаковость. Дана следующая сигнатура метода:

public static boolean equalNum(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.

Подсказки:

int x=123%10; // х будет иметь значение 3

int у=123/10; // у будет иметь значение 12

Пример 1:
x=1111
результат: true
Пример 2:
x=1211
результат: false
 */

package ru.stepup.courses.cycle;

public class EqualNum {
    public static void main(String[] args) {
        System.out.println(equalNum(1111));
        System.out.println(equalNum(1211));
    }
    public static boolean equalNum(int x) {
        int i = 0;
        boolean res = false;
        do {
            i++;
            int x1 = 0;
            int x2 = 0;
            x1 = x % 10;
            x = x / 10;
            x2 = x % 10;
            res = x1 == x2;
            if (res == false) {
                return res = false;
            }
        } while ((x / 10) != 0);
        return res;
    }
}