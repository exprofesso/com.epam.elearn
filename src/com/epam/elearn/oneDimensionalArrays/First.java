package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Укажите натуральное число");
        int n = scanner.nextInt();

        System.out.println("Укажите второе натуральное число");
        int k = scanner.nextInt();
        int[] arr = generateArray(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int a : arr) {
            if (a % k == 0) {
                sum += a;
            }
        }
        System.out.println("Сумма равна " + sum);
    }

    private static int[] generateArray(int num) {
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

}
