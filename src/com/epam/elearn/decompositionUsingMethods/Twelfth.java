package com.epam.elearn.decompositionUsingMethods;

/*
12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Twelfth {
    public static int sum = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите чему равен К");
        int k = scanner.nextInt();
        System.out.println("Укажите чему равен N");
        int n = scanner.nextInt();

        int a[] = new int[n];

        System.out.println(Arrays.toString(summ(a, k)));
    }

    public static int[] mass(int a[]) { //заполнение массива
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }


    public static int[] summ(int a[], int k) {//сравнение суммы элементов и k
        a = mass(a);
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        if (sum > k) {
            int buf = sum - k;
            a[a.length - 1] = a[a.length - 1] - buf;
            return a;
        }
        if (sum < k) {
            int buf = k - sum;
            a[a.length - 1] = a[a.length - 1] + buf;
            return a;
        } else {
            return a;
        }
    }
}
