package ru.stepup.courses.geometry;

import java.util.Arrays;

public class StartPolyLine {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(12, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point[] points = new Point[]{p1, p2, p3, p4};
        PolyLine arrpoints = new PolyLine(points);
        System.out.println(arrpoints);
        double lengthpolyline = arrpoints.Length();
        System.out.println("Длина ломаной: " + lengthpolyline);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p2, p3);
        Line line3 = new Line(p3, p4);
        String arrline = "Массив линий [" + Arrays.toString(line1.getLines()) + ";" + Arrays.toString(line2.getLines()) + ";" + Arrays.toString(line3.getLines()) + "]";
        System.out.println(arrline);
        double lengtharrline = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Длина массива линий: " + lengtharrline);
        if (lengthpolyline == lengtharrline) {
            System.out.println("Длина ломаной и массива линий совпадают!");
        } else {
            System.out.println("Длина ломаной и массива линий не совпадают!");
        }
    }
}