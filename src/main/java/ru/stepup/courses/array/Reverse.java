/*
#6.Реверс. Дана следующая сигнатура метода:

public static void reverse(int[] arr);
Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
После проведенных изменений массив должен быть записан задом-наперед.

Пример:
arr=[1,2,3,4,5]
результат: arr=[5,4,3,2,1]

 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }

    public static void reverse(int[] arr) {
        for (int i=0; i <  arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i]= arr[ arr.length - i -1];
            arr[ arr.length - i -1] = temp;

        }
        System.out.print(Arrays.toString(arr));
    }

}

