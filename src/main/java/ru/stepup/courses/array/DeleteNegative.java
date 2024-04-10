/*
#10.Удалить негатив. Дана следующая сигнатура метода:

public static int[] deleteNegative(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
в котором записаны все элементы массива arr кроме отрицательных.

Пример:
arr=[1,2,-3,4,-2,2,-5]
результат: [1,2,4,2]

 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class DeleteNegative {

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, 2, -5};
        System.out.print(Arrays.toString(deleteNegative(arr)));
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        int[] arr1 = new int[count];
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr1[count1] = arr[i];
                count1++;
            }
        }
        return arr1;
    }
}


