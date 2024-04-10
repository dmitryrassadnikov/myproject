/*
#5.Палиндром. Дана следующая сигнатура метода:

public static boolean palindrom(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если массив arr является палиндромом,
то есть справа-налево и наоборот читается одинаково

Пример 1:
arr=[1,-2,-7,4,2,2,5]
результат: false
Пример 2:
arr=[1,-2,-7,4,-7,-2,1]
результат: true

 */
package ru.stepup.courses.array;

public class Palindrom {

    public static void main(String[] args) {
        //int[] arr = {1, -2, -7, 4, -7, -2, 1};
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(palindrom(arr));
    }

    public static boolean palindrom(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int current = arr[i];
            System.out.println("arr[" + i + "]=" + current);
            if (current != arr[(arr.length - i) - 1]) {
                return false;
            }
        }
        return true;
    }
}

