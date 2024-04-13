/*
#2.Дан класс, описывающий точку координат:

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
Переопределите метод сравнения объектов по состоянию таким образом, чтобы две точки считались одинаковыми тогда,
когда они расположены в одинаковых координатах.
Переопределите метод клонирования, унаследованный от класса Object, таким образом, чтобы при его вызове возвращался
новый объект Точки, значения полей которого будут копиями оригинальной Точки.
 */

package ru.stepup.courses.object;

class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}