/*
#4.ООП. Пакеты. Простые имена
Создайте и выведите на экран экземпляры двух классов: Точки координат из пакета ru.сourses.geometry и точки координат
из пакета java.awt. Напишите код так, чтобы как минимум один из классов был доступен по простому имени.
 */

package ru.stepup.courses.main;

import ru.stepup.courses.geometry.Point;

public class StartPoint {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 3);
        awt.Point point3 = new awt.Point(5, 8);
        System.out.println("Вывод точки координат из пакета ru.stepup.courses.geometry: " + point1);
        System.out.println("Вывод точки координат из пакета ru.stepup.courses.geometry: " + point2);
        System.out.println("Вывод точки координат из пакета java.awt: " + point3);
    }
}
