package com.epam.elearn.stringOrStringbuilder;

/*
8. Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Eighth {
    public static void main(String[] args) {
        String example = "do you ever make phone calls or leave voicemail messages in English";

        System.out.println(longWord(example));
    }

    public static String longWord (String a){
        String longWord = "";
        int count = 0;
        String[] temp = a.split(" ");

        for (int i = 1; i < temp.length; i++){
            if(temp[i].length() > count){
                longWord = temp[i];
                count = temp[i].length();
            }
        }
        return longWord;
    }
}
