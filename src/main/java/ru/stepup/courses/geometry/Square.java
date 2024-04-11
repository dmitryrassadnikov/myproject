/*
#7.Квадрат. Дана следующая сигнатура метода:

public static void square(int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в высоту. Подсказка: метод System.out.print выводит без перехода на следующую строку, в то время как System.out.println выводит с переходом.

Пример 1:
x=2
результат:
**
**
Пример 2:
x=4
результат:
****
****
****
****
 */

package ru.stepup.courses.geometry;

public class Square {
    public static void main(String[] args) {
        square(2);
        square(4);
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}