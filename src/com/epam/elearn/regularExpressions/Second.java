package com.epam.elearn.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "   <note id = \"1\">\n" +
                "       <to>Вася</to>\n" +
                "       <from>Света</from>\n" +
                "       <heading>Напоминание</heading>\n" +
                "       <body>Позвони мне завтра!</body>\n" +
                "   </note>\n" +
                "   <note id = \"2\">\n" +
                "       <to>Петя</to>\n" +
                "       <from>Маша</from>\n" +
                "       <heading>Важное напоминание</heading>\n" +
                "       <body/>\n" +
                "   </note>\n" +
                "</notes>";

        System.out.println(xmlParser(xml));
    }

    public static String xmlParser(String xml) {
        Pattern openTag = Pattern.compile("<\\w.+?>");
        Pattern closedTag = Pattern.compile("</\\w.+?>");
        Pattern content = Pattern.compile(">.+?<");
        Pattern emptyTag = Pattern.compile("<\\w.+?>");

        StringBuilder stringBuilder = new StringBuilder();

        String[] text = xml.split("\n");

        for (String line : text) {
            Matcher mOpenTag = openTag.matcher(line);
            Matcher mClosedTag = closedTag.matcher(line);
            Matcher mContent = content.matcher(line);
            Matcher mEmptyTag = emptyTag.matcher(line);

            if (mOpenTag.find()) {
                stringBuilder.append(mOpenTag.group());
                stringBuilder.append("    opened Tag.\n");
            }
            if (mClosedTag.find()) {
                stringBuilder.append(mClosedTag.group());
                stringBuilder.append("    closed Tag.\n");
            }
            if (mContent.find()) {
                stringBuilder.append(mContent.group());
                stringBuilder.append("    content Tag.\n");
            }
            if (mEmptyTag.find()) {
                stringBuilder.append(mEmptyTag.group());
                stringBuilder.append("    emptyTag Tag. \n");
            }
        }
        return stringBuilder.toString();
    }
}
