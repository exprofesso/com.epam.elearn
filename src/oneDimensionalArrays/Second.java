package oneDimensionalArrays;


import java.util.Random;
import java.util.Scanner;

/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом. Подсчи­тать количество замен.
 */
public class Second {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int z = scanner.nextInt();
        int[] array = new int[z];
        System.out.println("Укажите число для замены");
        int b = scanner.nextInt();
        int number = b;
        int count = 0;

        System.out.println("Z = " + number);
        enterArrayRandom(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
                count++;
            }
        }

        System.out.println("Количество замен: " + count);
        System.out.println();
    }
    public static void enterArrayRandom(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
