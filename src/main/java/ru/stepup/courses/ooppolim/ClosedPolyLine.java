/*
#2.Дано 2 класса, один описывает точку координат, а другой ломаную линию:
Создайте такой подкласс класса PolyLine (также вместо него можно использовать Ломаную сделанную в более ранних задачах),
который будет представлять собой замкнутую ломанную линию (ClosedPolyLine), то есть последовательность точек, начинающихся и
заканчивающихся на одной и той же точке (см. рисунок 1). Данная сущность во всех отношениях совпадает с обычной Ломаной,
кроме расчета длины (она, очевидно, длиннее).
Учтите, что не следует просто копировать код метода length из PolyLine, вместо этого следует переиспользовать его.

 */

package ru.stepup.courses.ooppolim;

import java.util.Arrays;

import static java.lang.Math.round;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double Length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += (double) round(Math.sqrt(len1 * len1 + len2 * len2) * 10) / 10;
        }
        return sum;
    }

    public String toString() {
        return "Линия " + Arrays.toString(points);
    }
}

class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    public double Length() {
        Point[] temp = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            temp[i] = points[i];
        }
        temp[points.length] = points[0];
        points = temp;
        return super.Length();
    }
}
