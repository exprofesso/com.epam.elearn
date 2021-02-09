package com.epam.elearn.stringOrStringbuilder;

/*
7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Seventh {

    public static void main(String[] args) {
        String example = " This section    goes into more    detail about how    you should  use   Spring Boot. " +
                "It covers topics such as build systems,    auto-configuration, and how to run    your applications. " +
                "We also    cover some    Spring Boot best practices.    Although    there is    nothing    " +
                "particularly special about Spring Boot (it is just another    library that    you can consume),    " +
                "there    are    a few    recommendations    that, " +
                "when followed, make your    development process    a little easier   .";

        System.out.println(space(example));

    }
    




    public static String space(String a) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                stringBuilder.append(a.charAt(i));
            }
        }
        String str = stringBuilder.toString();
        return str;
    }

}
