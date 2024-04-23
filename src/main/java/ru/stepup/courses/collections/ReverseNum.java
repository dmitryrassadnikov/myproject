/*
#3.Перед вами код метода, который переставляет числа в массиве в обратном порядке.

public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }
Задача: написать такой же метод для ArrayList<Integer>.
*/

package ru.stepup.courses.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseNum {
    public static void main(String[] args) {


        // Массив с обратным порядком:
        int[] intArray = {10, 9, 8, 6, 7, 5, 1, 3, 2, 4};
        System.out.println("Начальный массив: " + Arrays.toString(intArray));
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int tmp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = tmp;
        }
        System.out.println("Массив с обратным порядком: " + Arrays.toString(intArray));

        // Список с обратным порядком:
        ArrayList<Integer> intList = new ArrayList<>();
        n = 10;
        for (int i = n; i >= 1; i--) {
            intList.add(i);
        }
        intList.set(3, 4);
        intList.set(6, 7);
        System.out.println("Начальный список: " + intList);
        for (int i = 0; i < intList.size() / 2; i++) {
            int tmp = intList.get(i);
            intList.set(i, intList.get(intList.size() - i - 1));
            intList.set(intList.size() - i - 1, tmp);
        }
        System.out.println("Список с обратным порядком: " + intList);
    }
}

