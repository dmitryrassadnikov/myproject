/*
#8.Левый треугольник. Дана следующая сигнатура метода:

public static void leftTriangle(int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки.

Пример 1:
x=2
результат:
*
**
Пример 2:
x=4
результат:
*
**
***
****
 */

package ru.stepup.courses.geometry;

public class LeftTriangle {
    public static void main(String[] args) {
        leftTriangle(2);
        leftTriangle(4);
    }

    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}