package com.epam.elearn.linearPrograms;


//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Fourth {
    public static void main(String[] args) {
        System.out.println(reverse(453.889));
    }
    public static double reverse (double x){
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }
}
