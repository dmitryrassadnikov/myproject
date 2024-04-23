/*
#2.Перед вами готовый к использованию метод printList(ArrayList<Integer>), который  все элементы списка по порядку
выводит в консоль.

Сейчас метод реализован с использованием оператора for.

Задача: переписать реализацию метода printList(ArrayList<Integer>), используя метод списка forEach(), принимающий
лямбда-выражение. Логика работы метода остается той же.

Подсказка: нужно использовать лямбда-выражение, передавая его в метод forEach().

public static void printList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
*/

package ru.stepup.courses.streamapi;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 9));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Вывод через for:" + list.get(i));
        }

        list.forEach(number -> System.out.println("Вывод через forEach:" + number));
    }
}



