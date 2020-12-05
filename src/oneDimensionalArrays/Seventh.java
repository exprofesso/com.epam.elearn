package oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

// Даны действительные числа а1 ,а2 ,..., аn. Найти
public class Seventh {
    public static void main(String[] args) {
        maxElement();
    }

    public static void maxElement () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int z = scanner.nextInt();
        int[] array = new int[z];

        enterArrayRandom(array);

        int max_value = Integer.MIN_VALUE;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            max_value = Integer.max(max_value, array[i] + array[j]);
        }
        System.out.println("Answer");
        System.out.println(max_value);

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
