package com.epam.elearn.decompositionUsingMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
5. Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Fifth {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int answer = scanner.nextInt();

        int[] array = new int[answer];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);

        if (array[array.length - 2] != array[array.length - 1]) {
            System.out.println(array[array.length - 2]);
        } else {
            for (int i = 2; array[array.length - i - 1] == array[array.length - i]; ) {
                i++;
                if (array[array.length - i - 1] != array[array.length - i])
                    System.out.println(array[array.length - i - 1]);
            }
            System.out.println();
        }
    }
}
