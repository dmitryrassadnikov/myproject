/*
#2.Числа наоборот. Дана следующая сигнатура метода:

public static String reverseListNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно). x может принимать значения от 0 и выше.

Пример:
x=5
результат: “5 4 3 2 1 0”
 */

package ru.stepup.courses.cycle;

public class ReverseListNums2 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = x; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}

