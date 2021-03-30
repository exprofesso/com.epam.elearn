package com.epam.elearn.basicsOfOop.first;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        StringBuilder reader = new StringBuilder(new StringBuilder(this.text));
        reader.append(' ');
        reader.append(text);
        this.text = reader.append(text).toString();
    }
}
