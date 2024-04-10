/*
#5.Длина числа. Дана следующая сигнатура метода:

public static int numLen(long x);
Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x. x может принимать значения от 0 и выше.

Подсказка:
int у=123/10; // у будет иметь значение 12
Пример:
x=12567
результат: 5
 */

package ru.stepup.courses.cycle;

public class NumLen {
    public static void main(String[] args) {
        System.out.println(numLen(12567));
    }

    public static int numLen(long x) {
        int i = 0;
        do {
            i++;
            x /= 10;
        } while (x != 0);
        return (int) i;
    }
}