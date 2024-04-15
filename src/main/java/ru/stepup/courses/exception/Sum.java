/*
#1.Необходимо написать приложение, которое принимает набор чисел в качестве параметров командной строки,
складывает их и результат выводит в консоль. Формат запуска приложения следующий:

java Sum 10 34 1
здесь Sum название класса, а числа после него будут переданы в массив строк, указанный в параметрах метода main.
Таким образом, метод main принимает массив строк, в каждом из которых записано число. Необходимо эти числа преобразовать
 в тип double с использованием Double.parseDouble(), а затем сложить их между собой. Метод parseDouble выкидывает
 исключение NumberFormatException в случае, если вместо числа было передано что-то иное. Обработайте данное исключение
 и все строки, не являющиеся числами, считайте за 0.

Пример:
java Sum 10 3qq4 1
результат: 11
*/

package ru.stepup.courses.exception;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = new String[3];
        double sum = 0;
        for (int i = 0; i < arrStr.length; i++) {
            try {
                System.out.print("Введите значение для элемента " + (i + 1) + ": ");
                arrStr[i] = scanner.nextLine();
                sum += parseDouble(arrStr[i]);
            } catch (NumberFormatException ex) {
                sum += 0;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
