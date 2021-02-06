package com.epam.elearn.stringOrStringbuilder;

// 2. В строке вставить после каждого символа 'a' символ 'b'.

public class Second {
    public static void main(String[] args) {

        String example = " This  aaa section    goes into more    detail about how    you should  use   Spring Boot. " +
                "It covers topics such as build systems,    auto-configuration, and how to run    your applications. " +
                "We also    cover some    Spring Boot best practices.    Although    there is    nothing    " +
                "particularly special about Spring Boot (it is just another    library that    you can consume),    " +
                "there    are    a few    recommendations    that, " +
                "when followed, make your      development process    a          little easier   .";

        System.out.println(charB(example));
    }

    public static String charB(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != 'a') {
                stringBuilder.append(a.charAt(i));
            } else if (a.charAt(i) == 'a') {
                stringBuilder.append('a');
                stringBuilder.append('b');
            }
        }
        String b = stringBuilder.toString();
        return b;
    }
}
