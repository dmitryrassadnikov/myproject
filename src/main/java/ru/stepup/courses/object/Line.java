/*
#3. Дан класс, описывающий Линию:

class Line{
    Point start,end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
}
Переопределите метод сравнения объектов по состоянию таким образом, чтобы две линии считались одинаковыми в том случае,
если их начало и конец расположены в одинаковых точках.
Переопределите метод клонирования, унаследованный от класса Object, таким образом, чтобы при его вызове возвращался
новый объект Линии, значения полей которого будут копиями оригинальной Линии (т.е. необходимо выполнить глубокое копирование).
 */

package ru.stepup.courses.object;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

class Line implements Cloneable{
    Point start;
    Point end;
    int x1, y1, x2, y2;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    double getLength() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        double length = (double) round(sqrt(dx * dx + dy * dy) * 10) / 10;
        return length;
    }

    public int[] getLines() {
        int[] lines = {start.x, start.y, end.x, end.y};
        return lines;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Line)) {
            return false;
        }
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line clonedLine = (Line) super.clone();
        clonedLine.start = (Point) start.clone();
        clonedLine.end = (Point) end.clone();
        return clonedLine;
    }
}

