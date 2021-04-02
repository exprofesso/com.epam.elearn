package com.epam.elearn.basicsOfOop.first;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */


public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Java OOP");
        String nameFile = "Spring in began";
        TextFile textFile = new TextFile(nameFile, directory);
        String text = "Весна наполнила весь мир очарованием";
        textFile.addText(text);

        textFile.printContent();

        textFile.changeName("Spring in began tomorrow");

        System.out.println("Новое имя файла " + textFile.getNameFile());

        String text1 = "Цветов и красок буйный карнавал.";

        textFile.addText(text1);

        textFile.printContent();


    }
}
