package com.epam.elearn.decompositionUsingMethods;

/*
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Fifteenth {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            findNumbers(i);
            System.out.println("\b\b");
        }
    }

    private static void findNumbers(int n) {
        int[] mas = new int[n];
        mas[0] = 1;
        while (mas[n - 1] < 9) {
            for (int i = 1; i < mas.length; i++) {
                mas[i] = mas[0] + i;
            }
            for (int element : mas) {
                System.out.print(element);
            }
            System.out.print(", ");
            mas[0]++;
        }
    }

}
