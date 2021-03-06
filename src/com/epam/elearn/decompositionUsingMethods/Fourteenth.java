package com.epam.elearn.decompositionUsingMethods;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */


import java.util.Scanner;

public class Fourteenth {
    private static int n = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите K: ");
        int k = scanner.nextInt();
        int mass[] = new int[k];

        decomposition(mass);
    }

    //заполнение массива от 1 до k
    public static int[] populate(int mas[]) {
        for (int i = 0, j = 0; i < mas.length; i++, j++) {
            mas[i] = j;
        }
        return mas;
    }


    public static void decomposition(int mas[]) {
        mas = populate(mas);

        int mas2[] = new int[10];
        //разложение числа на цифры
        for (int i = 0; i < mas.length; i++) {
            int buf1 = mas[i];
            while (buf1 >= 1) {
                int buf2 = buf1 - ((buf1 / 10) * 10);
                buf1 = buf1 / 10;
                mas2[n] = buf2;
                //счет разрядности числа
                n++;
            }
            //вызов метода сравнения числа массива и числа, вычисленного по алгоритму
            if (sum(mas2, n) == mas[i]) {
                System.out.println(mas[i]);
            }
            n = 0;
        }
    }

    //реализация алгоритма согласно примера 153=1*1*1+5*5*5+3*3*3=1+125+27
    public static int sum(int mas2[], int n) {
        int totalSum = 0;
        for (int j = 0, n2 = n; j < n; j++) {
            int level = 1;
            while (n2 > 0) {
                level = level * mas2[j];
                n2--;
            }
            n2 = n;
            totalSum = totalSum + level;

        }
        return totalSum;
    }

}
