package com.epam.elearn.cycles;


import java.util.Scanner;

// 7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Seventh {


    public static void main(String[] args) {
        numbersInNumber();
    }

    public static void numbersInNumber() {

        int a;
        int b;
        int[] arr = new int[10];

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input first number:");
            a = Integer.parseInt(scanner.nextLine());

            System.out.println("Input second number:");
            b = Integer.parseInt(scanner.nextLine());
        } while ((a <= 0) && (b <= 0));

        while(a != 0) {
            arr[a % 10]++;
            a /= 10;
        }

        while(b != 0) {
            if(arr[b % 10] != 0) {
                System.out.println(b % 10);
                arr[b % 10] = 0;
            }
            b /= 10;
        }
    }
}

