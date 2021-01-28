package com.epam.elearn.decompositionUsingMethods;

/*
3. Вычислить площадь правильного шестиугольника со стороной а,
используя метод вычисления площади треугольника.
 */

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите сторону треугольника");
        double si = scanner.nextDouble();
        System.out.println("площать шестиугольника равна " + square(si) * 6);
    }

    static double square(double a){

        double b = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        return b;
    }

}

