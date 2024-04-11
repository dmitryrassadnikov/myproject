/*
#3.Создайте класс Ломаная (PolyLine), которая будет представлять собой ломаную линию (см. пример на рис.1), которая описывается:

массив Точек, через которые линия проходит
При создании объекта можно ничего не указывать, или указать начальный набор Точек
Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это результат приведения к строке Точки с номером N
Может вернуть массив Линий (getLines)
Может вернуть свою длину (getLength)
Под Точкой имеется ввиду класс, созданный в задании 1 (точка координат). Под Линией имеется ввиду класс, созданный в задании 2 (линия).

Необходимо выполнить следующие задачи:

Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
Рассчитать длину Ломаной
Получить у Ломаной массив Линий
Рассчитать длину массива Линий
Сравнить длину Ломаной и массива Линий: они должны совпасть
Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
Подсказка: текстовое представление объекта лучше реализовывать в переопределенном методе toString()
 */

package ru.stepup.courses.geometry;

import java.util.Arrays;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class PolyLine {
    public Point[] points;
    public Line[] lines;

    public PolyLine() {
    }

    public PolyLine(Point[] points) {
        this.points = points;
    }

    public PolyLine(Line[] lines) {
        this.lines = lines;
    }

    public PolyLine(Line start, Line end) {
    }

    public PolyLine(String arrline) {
    }

    public String toString() {
        if (points != null) {
            return "Линия " + Arrays.toString(points);
        }
        return "Ломаная линия " + Arrays.toString(lines);
    }

    public double Length() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double dx = points[i + 1].x - points[i].x;
            double dy = points[i + 1].y - points[i].y;
            length += (double) round(sqrt(dx * dx + dy * dy) * 10) / 10;
        }
        return length;
    }
}

