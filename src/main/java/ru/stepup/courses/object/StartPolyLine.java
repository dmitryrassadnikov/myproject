package ru.stepup.courses.object;

public class StartPolyLine {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(12, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point[] points = new Point[]{p1, p2, p3, p4};
        PolyLine polyline1 = new PolyLine(points);
        PolyLine polyline2 = polyline1.clone();
        System.out.println(polyline1 == polyline2);
        System.out.println(polyline1.equals(polyline2));
        System.out.println(polyline1);
        System.out.println(polyline2);
    }
}