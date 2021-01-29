package com.epam.elearn.decompositionUsingMethods;

/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину X");
        int x = scanner.nextInt();
        System.out.println("Укажите длину Y");
        int y = scanner.nextInt();
        System.out.println("Укажите длину Z");
        int z = scanner.nextInt();
        System.out.println("Укажите длину T");
        int t = scanner.nextInt();

        System.out.println(square(x, y, z, t));
    }

    public static double square(int x, int y, int z, int t) {
        //разбиваем четырехугольник на два треугольника
        double s, s1, s2;
        double c = (double) (Math.sqrt(x * x + y * y));// диагональ и третья сторона второго треугольника
        double perimeter = (double) (z + t + c) / 2;
        s1 = (double) ((x * y) / 2);//площадь прямоугольного треугольника
        s2 = (double) (Math.sqrt((perimeter * (perimeter - t) * (perimeter - z) * (perimeter - c))));
        s = s1 + s2;
        return s;
    }
}
