package com.epam.elearn.aggregationAndСomposition.first;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Библия");
        Text text = new Text(word);

        Word word1 = new Word("в начале");
        Word word2 = new Word("было");
        Word word3 = new Word("слово");

        Sentence sentence = new Sentence();
        sentence.addSentence(word1);
        sentence.addSentence(word2);
        sentence.addSentence(word3);

        text.addBody(sentence);
        System.out.println("head: " + text.getHeader());
        System.out.println("body:" + text.getBody());
    }
}
