/*
#7.Возвратный реверс. Дана следующая сигнатура метода:

public static int[] reverseBack(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
в котором значения массива arr записаны задом наперед.

Пример:
arr=[1,2,3,4,5]
результат: [5,4,3,2,1]

 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class ReverseBack {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = reverseBack(arr);
        System.out.print(Arrays.toString(arr2));
    }

    public static int[] reverseBack(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        return arr2;
    }
}


