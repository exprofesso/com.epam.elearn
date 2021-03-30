package com.epam.elearn.basicsOfOop.first;

public class TextFile extends File {

    public Text content;

    public TextFile(String nameFile, Directory directory) {
        super(nameFile, directory);
        content = new Text("");
        super.getDirectory().addFile(this);
    }
    public void addText(String text){
        content.addText(text);
    }

    @Override
    public void changeName(String nameFile) {

    }
}
