package ru.stepup.courses.ooppolim;

public class StartClosedPolyLine {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(12, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point[] points = new Point[]{p1, p2, p3, p4};
        ClosedPolyLine arrpoints = new ClosedPolyLine(points);
        System.out.println(arrpoints);
        double lengthpolyline = arrpoints.Length();
        System.out.println("Длина замкнутой ломаной: " + lengthpolyline);
    }
}
