package ru.stepup.courses.ooppolim;

interface Measurable {
    double getLength();
}

public class StartMeasurable {
    public static void main(String[] args) {
        Point2 p1 = new Point2(1, 5);
        Point2 p2 = new Point2(12, 8);
        Point2 p3 = new Point2(5, 3);
        Point2 p4 = new Point2(8, 9);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p2, p3);
        Line line3 = new Line(p3, p4);
        Point2[] points = new Point2[]{p1, p2, p3, p4};
        PolyLine2 polyline = new PolyLine2(points);
        ClosedPolyLine2 closepolyline = new ClosedPolyLine2(points);
        System.out.println("Сумма длин линий: " + (m(line1) + m(line2) + m(line3)));
        System.out.println("Длина обычной ломаной линии: " + m(polyline));
        System.out.println("Длина замкнутой ломаной линии: " + m(closepolyline));

    }

    static double m(Measurable m) {
        return m.getLength();
    }
}

