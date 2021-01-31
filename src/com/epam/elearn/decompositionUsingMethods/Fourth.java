package com.epam.elearn.decompositionUsingMethods;

import java.util.Random;
import java.util.Scanner;

/*
4. На плоскости заданы своими координатами n точек.
Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.
 */
public class Fourth {

    private static double maxDistance;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Укажите колличество строк");
        int a = scanner.nextInt();
        System.out.println("Укажите колличество стобцов");
        int b = scanner.nextInt();

        int array[][] = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] result = findMaxDistance(array);

        System.out.printf("Максимальное расстояние между точками %d и %d, равно %.1f %n",
                result[0], result[1], maxDistance);
    }

    private static double distance(int[][] matrix) {// формула нахождения расстояния между координатами
        return Math.sqrt(Math.pow((matrix[0][0] - matrix[1][0]), 2)
                + Math.pow((matrix[0][1] - matrix[1][1]), 2));
    }

    private static int[] findMaxDistance(int[][] a) {
        int[] result = new int[2];
        double distance;
        maxDistance = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int[][] currentPoints = {{a[i][0], a[i][1]}, {a[j][0], a[j][1]}};
                distance = distance(currentPoints);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}
