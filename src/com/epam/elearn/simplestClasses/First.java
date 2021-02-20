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

    }
}

class Test1 {
    int age;


    public Test1(){
    }

    public Test1(int age) {
        this.age = age;
    }


}
