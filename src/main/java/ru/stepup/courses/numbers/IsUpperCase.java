/*
#6.Большая буква. Дана следующая сигнатура метода:

public static boolean isUpperCase(char x);
Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true если это большая
буква в диапазоне от ‘A’ до ‘Z’. При реализации метода не использовать методы класса Character.

Пример 1:
x=’D’
результат: true
Пример 2:
x=’q’
результат: false
 */

package ru.stepup.courses.classesandmethods;

public class IsUpperCase {
    public static void main(String[] args) {
        System.out.println(isUpperCase('D'));
        System.out.println(isUpperCase('q'));
    }

    public static boolean isUpperCase(char x) {
        boolean res = (x >= 'A') && (x <= 'Z');
        return res;
    }
}