/*
#4.Строка сравнения. Дана следующая сигнатура метода:

public static String makeDecision(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых методом числа и корректно выставленный знак операции сравнения (больше, меньше, или равно).

Пример 1:
x=5  y=7
результат: “5 < 7”
Пример 2:
x=8  y=-1
результат: “8 > -1”
Пример 3:
x=4  y=4
результат: “4 == 4”
 */


package ru.stepup.courses.conditions;

public class MakeDecision {
    public static void main(String[] args) {
        System.out.println(makeDecision(5, 7));
        System.out.println(makeDecision(8, -1));
        System.out.println(makeDecision(4, 4));
    }

    public static String makeDecision(int x, int y) {

        if (x > y) {
            return (x + " > " + y);
        } else if (x < y) {
            return (x + " < " + y);
        }
        return (x + " == " + y);
    }
}