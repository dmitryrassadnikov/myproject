/*
#8.Объединение. Дана следующая сигнатура метода:

public static int[] concat(int[] arr1, int[] arr2);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).

Пример:
arr1=[1,2,3]
arr2=[7,8,9]
результат: [1,2,3,7,8,9]

 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};
        int[] arr3 = concat(arr1, arr2);
        System.out.print(Arrays.toString(arr3));

    }

    public static int[] concat(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i <= arr2.length - 1; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;
    }
}

