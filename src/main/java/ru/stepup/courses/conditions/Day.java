/*
#11.День недели. Дана следующая сигнатура метода:

public static String day(int x);
Метод принимает число x, обозначающее день недели. Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая будет обозначать текущий день недели, где 1- это понедельник, а 7 – воскресенье. Если число не от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче используйте switch.

Пример:
x=5
результат: “пятница”
 */
package ru.stepup.courses.conditions;

public class Day {
    public static void main(String[] args) {
        System.out.println(day(4));
        System.out.println(day(9));
    }
    public static String day(int x) {
            String res;
            switch (x) {
                case 1: res = "Понедельник"; break;
                case 2: res = "Вторник"; break;
                case 3: res = "Среда"; break;
                case 4: res = "Четверг"; break;
                case 5: res = "Пятница"; break;
                case 6: res = "Суббота"; break;
                case 7: res = "Воскресенье"; break;
                default: res = "Это не день недели"; break;
            }
            return res;
        }
    }

