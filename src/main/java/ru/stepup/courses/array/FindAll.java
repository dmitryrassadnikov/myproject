/*
#9.Все вхождения. Дана следующая сигнатура метода:

public static int[] findAll(int[] arr, int x);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
в котором записаны индексы всех вхождений числа x в массив arr.

Пример:
arr=[1,2,3,8,2,2,9]
x=2
результат: [1,4,5]

 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int[] arr1 = findAll(arr, 2);
        System.out.print(Arrays.toString(arr1));
    }

    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] arr2 = new int[count];
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arr2[count1] = i;
                count1++;
            }
        }
        return arr2;
    }
}