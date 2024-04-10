/*
#1.Поиск первого значения. Дана следующая сигнатура метода:

public static int findFirst(int[] arr, int x);
Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.

Пример:
arr=[1,2,3,4,2,2,5]
x=2
результат: 1
 */
package ru.stepup.courses.array;

public class FindFirst {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(findFirst(arr, 2));
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            if (arr[i] == x) return i;
        }
        return -1;
    }
}

