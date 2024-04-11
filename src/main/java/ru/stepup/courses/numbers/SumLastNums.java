/*
#2.Сумма знаков. Дана следующая сигнатура метода:

public static int sumLastNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х, предполагая,
что знаков в числе не менее двух. Подсказки:
int x=123%10; // х будет иметь значение 3
int у=123/10; // у будет иметь значение 12
Пример:
x=4568
результат: 14
 */

package ru.stepup.courses.numbers;

public class SumLastNums {
    public static void main(String[] args) {
        System.out.println(sumLastNums(4568));
    }

    public static int sumLastNums(int x) {
        int x1 = x % 10;
        int x2 = x / 10;
        int x3 = x2 % 10;
        int res = x1 + x3;
        return res;
    }
}