package com.epam.elearn.cycles;

// 3. Найти сумму квадратов первых ста чисел.
public class Third {
    public static void main(String[] args) {
        System.out.println("Сумма квадратов первых ста чисел " + sumOfSquaresOfNumbers());
    }


    public static int sumOfSquaresOfNumbers (){
        int sum = 0;
        for (int i = 1; i <=100;i ++){
            sum += Math.pow(i,2);
        }
        return sum;
    }
}
