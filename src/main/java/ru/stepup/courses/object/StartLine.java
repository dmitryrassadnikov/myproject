package ru.stepup.courses.object;

public class StartLine {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point start = new Point(1, 3);
        Point end = new Point(8, 5);
        Line line1 = new Line(start, end);
        Line line2 = line1.clone();
        System.out.println(line1 == line2);
        System.out.println(line1.equals(line2));
        System.out.println(line1);
        System.out.println(line2);
    }
}

