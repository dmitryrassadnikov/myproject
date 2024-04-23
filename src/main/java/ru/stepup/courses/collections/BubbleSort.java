/*
#2.Перед вами код метода: реализации сортировки «пузырьком».

Перепишите код, чтобы вместо списка ArrayList<Integer> intList использовался массив int[] intArray.

public static void bubbleSort(ArrayList intList) {
for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
}

public static void bubbleSort(int[] intArray) {
	// Реализовать сортировку для массива
}
*/

package ru.stepup.courses.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (int i = n; i >= 1; i--) {
            intList.add(i);
        }
        System.out.println("Начальный список: " + intList);
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int tmp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, tmp);
                }
            }
        }
        System.out.println("Список с сортировкой 'пузырьком': " + intList);


        // Массив с сортировкой "пузырьком":
        int[] intArray = {10, 9, 8, 6, 7, 5, 1, 3, 2, 4};
        System.out.println("Начальный массив: " + Arrays.toString(intArray));
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Массив с сортировкой 'пузырьком': " + Arrays.toString(intArray));
    }
}


