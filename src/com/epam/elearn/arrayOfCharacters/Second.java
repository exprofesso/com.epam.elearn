package com.epam.elearn.arrayOfCharacters;

// 2. Замените в строке все вхождения 'word' на 'letter'.

public class Second {

    public static void main(String[] args) {
        String word = "word and book, word and book";

        String letter = word.replace("word", "letter");

        System.out.println(letter);
    }





}
