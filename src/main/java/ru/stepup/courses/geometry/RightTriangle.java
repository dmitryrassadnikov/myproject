/*
#9.Правый треугольник. Дана следующая сигнатура метода:

public static void rightTriangle(int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки, при этом треугольник выровнен по правому краю. Подсказка: перед символами ‘*’ следует выводить необходимое количество пробелов.

Пример 1:
x=3
результат:
  *
 **
***
Пример 2:
x=4
результат:
   *
  **
 ***
****
 */

package ru.stepup.courses.cycle;

public class RightTriangle {
    public static void main(String[] args) {
        rightTriangle(3);
        rightTriangle(4);
    }

    public static void rightTriangle(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}