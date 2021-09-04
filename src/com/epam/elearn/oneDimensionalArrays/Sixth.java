package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

/*
6. Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class Sixth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите колличество элементов");
        int streamSize = scanner.nextInt();
        System.out.println("Укажите начальное(минимальное) значение ");
        int randomNumberOrigin = scanner.nextInt();
        System.out.println("Укажите конечное(максимальное) значение ");
        int randomNumberBound = scanner.nextInt();


        primeNumbers(streamSize, randomNumberOrigin, randomNumberBound);
    }

    public static void primeNumbers(int streamSize, int randomNumberOrigin, int randomNumberBound) {
        int[] arr = new Random().ints(streamSize, randomNumberOrigin, randomNumberBound).toArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        for (int arrays : arr) {
            System.out.print(arrays + " ");
        }
        System.out.println("\n Summ: " + sum);
    }


    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int remainder;
        for (int i = 2; i <= x / 2; i++) {
            remainder = x % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
