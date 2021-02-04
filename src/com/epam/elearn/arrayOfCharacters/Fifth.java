package com.epam.elearn.arrayOfCharacters;

/*
5. Удалить в строке все лишние пробелы,
то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Fifth {

    public static void main(String[] args) {

        String space = " This section    goes into more    detail about how    you should  use   Spring Boot. " +
                "It covers topics such as build systems,    auto-configuration, and how to run    your applications. " +
                "We also    cover some    Spring Boot best practices.    Although    there is    nothing    " +
                "particularly special about Spring Boot (it is just another    library that    you can consume),    " +
                "there    are    a few    recommendations    that, " +
                "when followed, make your    development process    a little easier   .";

        System.out.println(removeExtraSpaces(space));


    }


    public static String removeExtraSpaces (String text){
        StringBuilder stringBuilder = new StringBuilder();
        String space = text.trim();

        boolean inSpase = false;

        for (int i = 0; i < space.length(); i++){
            if(space.charAt(i) == ' '){
                if (!inSpase){
                    stringBuilder.append(" ");
                }
                inSpase = true;
            } else {
                stringBuilder.append(space.charAt(i));
                inSpase = false;
            }
        }
        return stringBuilder.toString();
    }


}
