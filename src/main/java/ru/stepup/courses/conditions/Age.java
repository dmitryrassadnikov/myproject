/*
#10.Возраст. Дана следующая сигнатура метода:

public static String age(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х, а затем одно из слов:

год
года
лет
Слово “год” добавляется, если число х заканчивается на 1, кроме чисел оканчивающихся на 11.

Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел оканчивающихся на 12, 13, 14.

Слово “лет” добавляется во всех остальных случаях.

Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: “5 лет”
Пример 2:
x=31
результат: “31 год”
Пример 3:
x=44
результат: “44 года”
*/
package ru.stepup.courses.conditions;

public class Age {
    public static void main(String[] args) {
        System.out.println(age(5));
        System.out.println(age(31));
        System.out.println(age(44));
        System.out.println(age(13));
    }

    public static boolean year(int x) {
        int x1 = x % 10;
        int x2 = x / 10;
        int x3 = x2 % 10;
        boolean res = (x1 == 1) && (x3 != 1);
        return res;
    }

    public static boolean yearS(int x) {
        int x1 = x % 10;
        int x2 = x / 10;
        int x3 = x2 % 10;
        boolean res = ((x1 == 2) && (x3 != 1)) || ((x1 == 3) && (x3 != 1)) || ((x1 == 4) && (x3 != 1));
        return res;
    }

    public static String age(int x) {
        String res;
        if (year(x)) {
            res = x + " год";
            return res;
        } else if (yearS(x)) {
            res = x + " года";
            return res;
        }
        return res = x + " лет";
    }
}