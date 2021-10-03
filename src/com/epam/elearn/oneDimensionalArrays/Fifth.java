package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Fifth {
    public static void main(String[] args) {
        more();
    }

    public static void more() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int z = scanner.nextInt();
        int[] array = new int[z];
        System.out.println("Укажите меньше какого числа должно быть");
        int y = scanner.nextInt();

        enterArrayRandom(array);
        System.out.println("You array");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < y) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void enterArrayRandom(int[] mas) {
        Random random = new Random();
        System.out.println("Array");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
