package com.epam.elearn.simplestClasses;

/*
7. Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Seventh {
    public static void main(String[] args) {

        Point a = new Point(1, 1);
        Point b = new Point(4, 9);
        Point c = new Point(5, 3);

        System.out.printf("a(%.1f,%.1f); b(%.1f,%.1f); c(%.1f,%.1f).%n", a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());

        Triangle triangle = Triangle.createTriangle(a, b, c);

        // периметр
        double perimeter = triangle.perimeter();
        System.out.println(perimeter);

        // площадь
        double area = triangle.areaTriangel();
        System.out.println(area);

        // точка пересечения медиан
        Point median = triangle.pointMedianIntersection();
        System.out.printf("median(%.3f, %.3f)", median.getX(), median.getY());


    }
}

class Triangle {
    private Side a;
    private Side b;
    private Side c;


    Triangle(Side a, Side b, Side c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(c, a);
        return new Triangle(A, B, C);
    }

    // нахождение периметра
    public double perimeter() {
        return a.getLength() + b.getLength() + c.getLength();
    }

    // нахождение площади треугольника
    public double areaTriangel() {
        double area = perimeter() / 2;
        return Math.sqrt(area * (area - a.getLength()) * (area - c.getLength()) * (area - c.getLength()));
    }

    // расчет точки пересечения медиан
    public Point pointMedianIntersection() {
        double x = (a.getA().getX() + a.getB().getX() + b.getB().getX()) / 3;
        double y = (a.getA().getY() + a.getB().getY() + b.getB().getY()) / 3;
        return new Point(x, y);
    }

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

    double getLength() {
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
