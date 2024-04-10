/*
#4.Подсчет позитива. Дана следующая сигнатура метода:

public static int countPositive(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.

Пример:
arr=[1,-2,-7,4,2,2,5]
результат: 5
 */
package ru.stepup.courses.array;

public class CountPositive {

    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(countPositive(arr));
    }

    public static int countPositive(int[] arr) {
        int count = arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            if (arr[i] > 0) count++;
        }
        return count;
    }
}

