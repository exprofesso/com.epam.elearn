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
import java.util.regex.Pattern;

public class First {

    public static void main(String[] args) {

        String example = "Один десять. Два. Три семь. Четыре шесть. \n" +
                "Один. Два.\n" +
                "Один. Два. Три. Четыре. Пять.\n" +
                "Один сто девятьсот.\n" +
                "Один на улице. Два на море. Три в лесу на природе.";

        word(example);


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

    public static String[] splitLength (String text){
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(text);
    }

    public static void word(String a){

        String [] sort = a.split("\n");
        for (int i = 0; i < sort.length; i++){
            String temp [] = splitSentences(sort[i]);
            for (int j = 0; j < temp.length; j++){
             String[] words = splitLength(temp[j]);

                // сортировка слов
                for (int z = words.length - 1; z >= 0; z--){
                    for (int y = 0; y < z; y++){
                        if(words[y].length() > words[y + 1].length()){
                            String change = words[y];
                            words[y] = words[y + 1];
                            words[y + 1] = change;
                        }
                    }
                }
                for (int q = 0; q < words.length; q++){
                    System.out.print(words[q] + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
     
}



