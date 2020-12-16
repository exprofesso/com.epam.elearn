package com.epam.elearn.cycles;

// 6. Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

public class Sixth {

    public static void main(String[] args) {
        division(200,299);
    }
    public static void division (int m, int n){
        while (m < n){
            System.out.print(m + ": ");
            for(int i = 2; i < m -1; i++) {
                if(m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
            m++;
        }
    }
}
