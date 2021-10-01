package com.epam.elearn.decompositionUsingMethods;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Sixteenth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первое число");
        int a = scanner.nextInt();
        System.out.println("Укажите второе число");
        int b = scanner.nextInt();

        int sum = sumOddNumbers(a, b);
        int even = numberEvenNumbers(sum);

        System.out.println("Сумма нечетных чисел " + sum);
        System.out.println("Колличество четных чисел " + even);

//        for (int i = 10; i <= 99; i++) {
//            if (i % 2 != 0) {
//                sum = sum + i;
//                //   System.out.println(i)
//            }
//        }
//        while (sum > 2) {
//            sum = sum / 10;
//            if (sum % 2 == 0) {
//                even++;
//                System.out.println(sum);
//                System.out.println("_________");
//            }
//        }
    }

    public static int sumOddNumbers(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                //   System.out.println(i)
            }
        }
        return sum;
    }

    public static int numberEvenNumbers(int sum) {
        int even = 0;
        while (sum > 2) {
            sum = sum / 10;
            if (sum % 2 == 0) {
                even++;
//                System.out.println(sum);
//                System.out.println("_________");
            }
        }
        return even;
    }
}
