package com.epam.elearn.basicsOfOop.first;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */


public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Java OOP");

        // создание имени
        String nameFile = "Spring in began";

        TextFile textFile = new TextFile(nameFile, directory);
        String text = "Весна наполнила весь мир очарованием";

        // добавление текста
        textFile.addText(text);

        textFile.printContent();

        // Изменить имя
        textFile.changeName("Spring in began tomorrow");
        System.out.println("Новое имя файла " + textFile.getNameFile());

        String text1 = "Цветов и красок буйный карнавал.";

        // добавления еще текста
        textFile.addText(text1);
        textFile.printContent();

        // создание второго файла и вывод директории

        String nameFileSecond = "Summer not away";
        TextFile textFile1 = new TextFile(nameFileSecond, directory);

        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }

        // Удаление файла
        directory.deleteFile("Summer not away");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}
