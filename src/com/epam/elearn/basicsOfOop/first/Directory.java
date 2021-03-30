package com.epam.elearn.basicsOfOop.first;

import java.util.ArrayList;

public class Directory {
    private String directoryName;
    private ArrayList<TextFile> files;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName){
        this.directoryName = directoryName;
    }
    public ArrayList<TextFile> getFiles (){
        return files;
    }
    public void addFile(TextFile textFile){
        this.files.add(textFile);
    }
    public void deleteFile(TextFile textFile){
        for (int i = 0; i < files.size(); i++){
            if(files.get(i)getFileName().equalsIgnoreCase(textFile)){
                files.remove(i);
            }
        }
    }

}
