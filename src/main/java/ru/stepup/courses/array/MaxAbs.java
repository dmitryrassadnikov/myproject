/*
#3.Поиск максимального. Дана следующая сигнатура метода:

public static int maxAbs(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю
(то есть без учета знака) значение массива arr.

Пример:
arr=[1,-2,-7,4,2,2,5]
результат: -7
 */
package ru.stepup.courses.array;

public class MaxAbs {

    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(maxAbs(arr));
    }

    public static int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            System.out.println("arr[" + i + "]=" + current);
            if (abs(current) > abs(max)) {
                max = current;
            }
        }
        return max;
    }
    public static int abs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }
}


