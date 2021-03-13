package com.epam.elearn.aggregationAndСomposition.first;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Text {
    private String header;
    private String body = "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentence sentence) {
        header = sentence.getSentense();
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Sentence sentence) {
        body += " " + sentence.getSentense();
    }
}
