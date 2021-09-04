package com.epam.elearn.regularExpressions;

/*
1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
три различных операции:
отсортировать абзацы по количеству предложений;
в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
а в случае равенства – по алфавиту.
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class First {

    public static void main(String[] args) {

        String example = "Один десять. Два. Три семь. Четыре шесть. \n" +
                "Один. Два.\n" +
                "Один. Два. Три. Четыре. Пять.\n" +
                "Один сто девятьсот.\n" +
                "Один на улице. Два на море. Три в лесу на природе.";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете что отсертировать \n" +
                " 1 для сортировки абзацев \n" +
                " 2 для сортировки предложений \n" +
                " 3 для сортировки лексем \n" +
                " 4 для выхода из программы");
        int choose = 0;


        while (choose != 4) {
            choose = scanner.nextInt();
            String a = "";
            if (choose == 3) {
                System.out.println("Укажите лексему для сортировки ");
                a = scanner.nextLine();
                System.out.println(a);
            }
            switch (choose) {
                case (1):
                    sortParagraph(example);
                    break;
                case (2):
                    word(example);
                    break;
                case (3):
                    lexeme(example, a);
                    break;
                case (4):
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Вы выбрали не верный пункт");
                    break;
            }

//            System.out.println("Укажите лексему для сортировки ");
//                a = scanner.nextLine();
//            System.out.println(a);
//                lexeme(example, a);
        }
    }

    public static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    // Сортировка обзацей по возростанию
    public static void sortParagraph(String a) {

        String[] sort = a.split("\n");
        int[] numberParagraph = new int[sort.length];
        int count = 0;

        for (int i = 0; i < sort.length; i++) {
            String[] strings = splitSentences(sort[i]);
            numberParagraph[i] = strings.length;
            if (count < strings.length) {
                count = strings.length;
            }
        }
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < numberParagraph.length; j++) {
                if (i == numberParagraph[j]) {
                    System.out.println(sort[j] + "\t");
                }
            }
        }
        System.out.println();
    }

    public static String[] splitLength(String text) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(text);
    }


    // сортировка предложений по длине слов
    public static void word(String a) {

        String[] sort = a.split("\n");
        for (int i = 0; i < sort.length; i++) {
            String sentences[] = splitSentences(sort[i]);
            for (int j = 0; j < sentences.length; j++) {
                String[] words = splitLength(sentences[j]);

                // сортировка слов
                for (int z = words.length - 1; z >= 0; z--) {
                    for (int y = 0; y < z; y++) {
                        if (words[y].length() > words[y + 1].length()) {
                            String change = words[y];
                            words[y] = words[y + 1];
                            words[y + 1] = change;
                        }
                    }
                }
                for (int q = 0; q < words.length; q++) {
                    System.out.print(words[q] + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // сортировка по лексемам

    public static void lexeme(String text, String letter) {
        String[] sort = text.split("\n");
        for (int i = 0; i < sort.length; i++) {
            String sentences[] = splitSentences(sort[i]);
            for (int j = 0; j < sentences.length; j++) {
                String[] words = splitLength(sentences[j]);

                for (int z = words.length - 1; z >= 0; z--) {
                    for (int y = 0; y < z; y++) {
                        int right = 0;
                        int left = 0;
                        for (int t = 0; t < words[y].length(); t++) {
                            if (String.valueOf(words[y].charAt(t)).compareToIgnoreCase(letter) == 0) {
                                left++;
                            }
                        }
                        for (int t = 0; t < words[y + 1].length(); t++) {
                            if (String.valueOf(words[y + 1].charAt(t)).compareToIgnoreCase(letter) == -1) ;
                            right++;
                        }
                        if (left < right) {
                            String cloud = words[y];
                            words[y] = words[y + 1];
                            words[y + 1] = cloud;

                            // сортировка по алфавиту
                        } else if (left == right) {
                            String[] abc = {words[y], words[y + 1]};
                            Arrays.sort(abc);
                            words[y] = abc[0];
                            words[y + 1] = abc[1];
                        }
                    }
                }
                for (int q = 0; q < words.length; q++) {
                    System.out.print(words[q] + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

}





