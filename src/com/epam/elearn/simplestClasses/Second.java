package com.epam.elearn.simplestClasses;

/*
2. Создйте класс Test2 двумя переменными.
Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Second {
    public static void main(String[] args) {

        Test2 test1 = new Test2();
        Test2 test2 = new Test2("Коля", 29);

        test1.setName("Дима");
        test1.setAge(30);

        System.out.println(test1.getName() + " " + test1.getAge());
        System.out.println(test2.getName() + " " + test2.getAge());


    }
}

class Test2 {
    String name;
    int age;

    public Test2() {
    }

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
