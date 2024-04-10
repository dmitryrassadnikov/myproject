/*
#3. Имеем два класса: Линия (Line) и Ломаная линия (PolyLine2). У обоих классов присутствует метод
расчёта длины (getLength). Обеспечьте обоим классам общий интерфейс (Measurable). Разработайте метод,
который принимает набор объектов, тип которых совпадает с разработанным интерфейсом.
Передайте в этот метод одну обычную Ломаную, из задачи №2 Замкнутая ломаная и одну
Замкнутую и выведите результат на экран.

 */

package ru.stepup.courses.ooppolim;

import java.util.Arrays;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;


class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class PolyLine2 implements Measurable {
    Point2[] points;

    public PolyLine2(Point2... points) {
        this.points = points;
    }

    public double getLength() {
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

class Line implements Measurable {
    Point2 start;
    Point2 end;
    int x1, y1, x2, y2;


    public Line(Point2 start, Point2 end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        start = new Point2(x1, y1);
        end = new Point2(x2, y2);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public double getLength() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        double length = (double) round(sqrt(dx * dx + dy * dy) * 10) / 10;
        return length;
    }


    public int[] getLines() {
        int[] lines = {start.x, start.y, end.x, end.y};
        return lines;
    }
}

class ClosedPolyLine2 extends PolyLine2 {

    public ClosedPolyLine2(Point2... points) {
        super(points);
    }

    public double getLength() {
        Point2[] temp = new Point2[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            temp[i] = points[i];
        }
        temp[points.length] = points[0];
        points = temp;
        return super.getLength();
    }
}