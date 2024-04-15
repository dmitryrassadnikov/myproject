/*
#2.Исключение NumberFormatException относится к unchecked типу, то есть его логика говорит о том, что необходимо не
обрабатывать его, а предотвратить его появление. Перепишите приложение из задания #1 таким образом, чтобы
обрабатывать исключение не требовалось.
*/

package ru.stepup.courses.exception;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = new String[3];
        double sum = 0;
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print("Введите значение для элемента " + (i + 1) + ": ");
            arrStr[i] = scanner.nextLine();
            if (arrStr[i].matches("\\d+(\\.\\d+)?")) {
                sum += parseDouble(arrStr[i]);
            } else {
                sum += 0;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}