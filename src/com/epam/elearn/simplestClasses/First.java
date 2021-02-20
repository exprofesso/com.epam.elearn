package com.epam.elearn.simplestClasses;

/*
1. Создайте класс Test1 двумя переменными.
Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод,
который находит наибольшее значение из этих двух переменных.
 */


public class First {

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        Test1 test2 = new Test1();

        test1.setAge(34);
        test1.printAge();

        test2.setAge(30);
        test2.printAge();
        System.out.println("++++++++++++");
        System.out.println("Cуммой двух чисел будет " + Test1.sum(test1.getAge(), test2.getAge()));
        System.out.println("++++++++++++");
        System.out.println("Наибольшее значение будет " + Test1.most(test1.getAge(), test2.getAge()));


    }
}

class Test1 {
    private int age;

    public Test1() {
    }

    public Test1(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void printAge() {
        System.out.println(age);
    }

    public static int sum(int age1, int age2) {
        int sum = age1 + age2;
        return sum;
    }

    public static int most(int age1, int age2) {
        int most;
        if (age1 > age2) {
            most = age1;
        } else if (age1 < age2) {
            most = age2;
        } else {
            most = 0;
        }
        return most;
    }

}
