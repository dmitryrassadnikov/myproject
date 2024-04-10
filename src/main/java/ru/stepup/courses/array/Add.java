/*
#11.Добавление в массив. Дана следующая сигнатура метода:

public static int[] add(int[] arr, int x, int pos);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.

Пример:
arr=[1,2,3,4,5]
x=9
pos=3
результат: [1,2,3,9,4,5]
 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class Add {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(add(arr, 9, 5)));
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            arr1[i] = arr[i];

        }
        for (int i = 0; i < arr.length - pos; i++) {
            arr1[pos] = x;
            arr1[pos + 1 + i] = arr[pos + i];
        }
        return arr1;
    }
}


