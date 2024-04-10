/*
#1.Дан класс, описывающий точку координат:

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
Создайте такой подкласс (Point3D) класса Point, который будет иметь не две, а три координаты на плоскости: X,Y,Z.
Вместо класса приведенного в задании можно использовать сделанный ранее самостоятельно класс Точки.
 */

package ru.stepup.courses.ooppolim;

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class Point3D extends Point2D {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }
}