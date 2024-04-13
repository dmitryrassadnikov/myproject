/*
#4.Дан класс, описывающий ломаную линию:

class PolyLine{

    Point[] points;

    public PolyLine(Point... points) {

        this.points = points;

    }

    public double length(){

        double sum=0,len1,len2;

        for(int i=0;i<points.length-1;i++){

            len1=points[i].x-points[i-1].x;

            len2=points[i].y-points[i-1].y;

            sum+=Math.sqrt(len1*len1+len2*len2);

        }

        return sum;

    }

}

Переопределите метод сравнения объектов по состоянию таким образом, чтобы две ломанные считались одинаковыми
тогда, когда все их точки совпадают.
 */

package ru.stepup.courses.object;

import java.util.Arrays;


class PolyLine implements Cloneable {

    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public String toString() {
        return "Ломаная линия " + Arrays.toString(points);
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i - 1].x;
            len2 = points[i].y - points[i - 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PolyLine)) {
            return false;
        }
        PolyLine polyline = (PolyLine) o;
        if (polyline.points.length != points.length) {
            return false;
        }
        for (int i = 0; i < points.length; i++) {
            if (!points[i].equals(polyline.points[i])) {
                return false;
            }
        }
        return true;
    }

    public PolyLine clone() throws CloneNotSupportedException {
        PolyLine polyline = (PolyLine) super.clone();
        return polyline;
    }
}
