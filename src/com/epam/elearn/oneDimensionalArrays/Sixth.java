package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

/*
6. Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class Sixth {

    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers() {
            int[] arr = new Random().ints(50,0, 50).toArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(i)) {
                    sum+=arr[i];
                }
            }
            System.out.println("Summ: " + sum);
    }


    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
