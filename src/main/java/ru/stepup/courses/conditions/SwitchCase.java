/*
#8.1.Тридцать пять. Дана следующая сигнатура метода:

public static boolean is35(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если число x делится нацело на 3 или 5.
Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: true
Пример 2:
x=8
результат: false
Пример 3:
x=15
результат: false
 */

package ru.stepup.courses.conditions;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println(switchCase("вторник"));
    }

    public static String switchCase(String str) {
        switch (str) {
            case "понедельник": str+=" Понедельник";break;
            case "вторник": str+=" Вторник";
            case "среда": str+=" Среда";
            case "четверг": str+=" Четверг";break;
            case "пятница": str+=" Пятница";break;
            case "суббота": str+=" Суббота";break;
            case "воскресенье": str+=" Воскресенье"; break;
            default: str+="Это не день недели"; break;


        }
    return  str;
    }


}

