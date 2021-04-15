package com.epam.elearn.basicsOfOop.first;

abstract class File {
    private final String NAMEFILE;
    private Directory directory;

    public File(String NAMEFILE, Directory directory) {
        this.NAMEFILE = NAMEFILE;
        this.directory = directory;
    }


    public String getNameFile() {
        return NAMEFILE;
    }

//    public void setNameFile(String nameFile) {
//        this.nameFile = nameFile;
//    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "File " +
                " nameFile = '" + NAMEFILE + '\'' +
                ", directory = " + directory;
    }
//    abstract public void changeName(String nameFile);
}
