package com.epam.elearn.simplestClasses;

/*
7. Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Seventh {

}

class Triangle {

}

class Side {
    private Point a;
    private Point b;

    Side(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    double sumSide() {
        return Math.sqrt(Math.pow((a.getX() - b.getY()), 2) + Math.pow((a.getX() - b.getY()), 2));
    }

}

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
