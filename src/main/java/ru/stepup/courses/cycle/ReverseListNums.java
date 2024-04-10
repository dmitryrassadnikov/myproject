/*
#2.Числа наоборот. Дана следующая сигнатура метода:

public static String reverseListNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно). x может принимать значения от 0 и выше.

Пример:
x=5
результат: “5 4 3 2 1 0”
 */
package ru.stepup.courses.cycle;

public class ReverseListNums {
    public static void main(String[] args) {
        System.out.println(reverseListNums(5));
    }

    public static String reverseListNums(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.println(i);
        }
        return "";
    }
}

