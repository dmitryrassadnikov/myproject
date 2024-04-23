/*
#1.Задайте лист размерностью N, где N — чётное число, а содержимое — числа от 1 до N.

Поменяйте местами попарно его элементы. То есть первый со вторым, третий с четвёртым и т.д.
*/

package ru.stepup.courses.collections;

import java.util.ArrayList;

public class PairPermut {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println("Начальный список: " + list);
        for (int i = 0; i < list.size(); i += 2) {
            int tmp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, tmp);
        }
        System.out.println("Список с попарными перестановками: " + list);
    }
}

