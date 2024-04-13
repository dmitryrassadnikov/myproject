package ru.stepup.courses.object;

public class StartPoint {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(9, 5);
        Point point2 = point1.clone();
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1);
        System.out.println(point2);
    }
}
