/*
#12.Добавление массива в массив. Дана следующая сигнатура метода:

public static int[] add(int[] arr, int[] ins, int pos);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
который будет содержать все элементы массива arr, однако в позицию pos будут
вставлены значения массива ins.

Пример:
arr=[1,2,3,4,5]
ins=[7,8,9]
pos=3
результат: [1,2,3,7,8,9,4,5]

 */
package ru.stepup.courses.array;

import java.util.Arrays;

public class AddArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.print(Arrays.toString(add(arr, ins, 3)));
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] arr1 = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            arr1[pos + i] = ins[i];
        }
        for (int i = 0; i < arr.length - pos; i++) {
            arr1[pos + ins.length + i] = arr[pos + i];
        }
        return arr1;
    }
}