package com.epam.elearn.decompositionUsingMethods;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import java.util.Scanner;

public class Second {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первое натуральное число");
        int n1 = scanner.nextInt();
        System.out.println("Укажите второе натуральное число");
        int n2 = scanner.nextInt();
        System.out.println("Укажите третье натуральное число");
        int n3 = scanner.nextInt();
        System.out.println("Укажите четвертое натуральное число");
        int n4 = scanner.nextInt();

        System.out.println("НОД = "+nod(nod(n1, n2), nod(n3, n4)));

    }

    public static int nod(int n1, int n2) {//нахождение НОД
        int nod = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                nod = i;
            }
        }

        return nod;
    }


}
