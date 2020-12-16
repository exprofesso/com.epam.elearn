package com.epam.elearn.cycles;

import java.util.Scanner;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа
 */
public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укаэите положительное число ");
        int num = scanner.nextInt();
        while (num <= 0){
            System.out.println("Укаэите только положительное число ");
            num = scanner.nextInt();
        }
            System.out.println("Суммой всех чисел от 1 до " + num +" " + "будет = " + sumOfNumbers(num));
    }

    public static int sumOfNumbers (int num){
        int count = 0;
        for (int i = 1; i <=num; i++){
            count = count + i;
        }
        return count;
    }
}
