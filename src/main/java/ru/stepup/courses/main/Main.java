/*
#3.ООП. Пакеты. Возведение в степень.
Создайте метод принимающий две строки, в которых будут записаны числа X и Y.
Возвращает метод результат возведения X в степень Y. Для преобразования строки в число следует использовать
метод Integer.parseInt, а для возведения в степень метод Math.pow. Вызовите разработанный метод передав
туда параметры командной строки полученные точкой входа в программу. Реализуйте метод так, что бы для возведения
в степень и преобразования строки использовались короткие имена статических методов (pow и parseInt).
*/


package ru.stepup.courses.main;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static double power(String x, String y) {
        int num = parseInt(x);
        int powNum = parseInt(y);
        return pow(num, powNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String x = scanner.nextLine();
        System.out.print("Введите степень числа: ");
        String y = scanner.nextLine();
        System.out.println(power(x, y));
    }
}