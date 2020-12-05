package oneDimensionalArrays;


import java.util.Random;
import java.util.Scanner;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Fourth {
    public static void main(String[] args) {
        maxAndMin();
    }

    public static void maxAndMin() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int z = scanner.nextInt();
        int[] array = new int[z];

        int max = array[0];
        int maxPoint = array[0];
        int min = array[0];
        int minPoint = array[0];


        enterArrayRandom(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                maxPoint = i;
                max = array[i];
            } else if (array[i] <= min) {
                minPoint = i;
                min = array[i];
            }

        }
            System.out.println();
            System.out.println("Максимальное число в массиве " + max);
            System.out.println("Минимальное число в массиве " + min);
            System.out.println();
            array[maxPoint] = min;
            array[minPoint] = max;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



    public static void enterArrayRandom(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
            System.out.print(mas[i] + " ");
        }
    }
}
