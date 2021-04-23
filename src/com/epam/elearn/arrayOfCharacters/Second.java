package com.epam.elearn.arrayOfCharacters;

// 2. Замените в строке все вхождения 'word' на 'letter'.

public class Second {

    public static void main(String[] args) {
        String text = "word and book, word and book";
        String text_replace = "";

//        String letter = text.replace("word", "letter");
//
//        System.out.println(letter);
        String word = "word";
        String letter = "letter";

        if (text.length() == word.length()) {
            if ((text.charAt(0) == word.charAt(0)) && (text.charAt(1) == word.charAt(1)) && (text.charAt(2) == word.charAt(2)) && (text.charAt(3) == word.charAt(3))) {
                text_replace += letter;
            } else {
                text_replace = text;
            }
        } else if (text.length() < word.length()) {
            text_replace = "Тут менять нечего";
        } else {
            for (int i = 0; i < text.length() - word.length(); i++) {
                if ((text.charAt(i) == word.charAt(0)) && (text.charAt(i + 1) == word.charAt(1)) && (text.charAt(i + 2) == word.charAt(2)) && (text.charAt(i + 3) == word.charAt(3))) {
                    text_replace += letter;
                    i = i + word.length() - 1;

                } else {
                    text_replace += text.charAt(i);
                }
            }
            String temp = "";
            for (int j = 0; j < word.length(); j++) {
                temp += text.charAt(text.length() - word.length() + j);
            }
            text_replace += temp;
            System.out.println(temp);

        }

        System.out.println(text_replace);

    }


}
