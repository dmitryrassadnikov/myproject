package ru.stepup.courses.oop;

import ru.stepup.courses.oop.Point;

public class StartLine {
    public static void main(String[] args) {
        Point start1 = new Point(1, 3);
        Point end1 = new Point(8, 5);
        Point start2 = new Point(11, 10);
        Point end2 = new Point(15, 19);
        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);
        Line line3 = new Line(end1, start2);
        double length1 = (double) line1.getLength();
        double length2 = (double) line2.getLength();
        double length3 = (double) line3.getLength();
        double res = length1 + length2 + length3;
        System.out.println(line3);
        System.out.printf("Суммарная длина трех линий равна " + "%.1f", res);
        //System.out.println(Arrays.toString(line3.getLines()));
    }
}

