package com.epam.elearn.aggregationAndСomposition.first;

public class Sentence {
    private String sentense = "";


    public void addSentence(Word word) {
        sentense += " " + word.getWord();
    }

    public String getSentense() {
        return sentense;
    }
}
