package com.epam.elearn.learnClass;

public class Book {

    private int bookId;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberPages;
    private float price;
    private String cover;


    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }

    public Book(int bookId, String name, String author, String publishingHouse, int year, int numberPages, float price, String cover) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberPages = numberPages;
        this.price = price;
        this.cover = cover;
    }


    public Book(int bookId, String name, float price) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId " + bookId +
                ", name '" + name + '\'' +
                ", author '" + author + '\'' +
                ", publishingHouse '" + publishingHouse + '\'' +
                ", year " + year +
                ", numberPages " + numberPages +
                ", price " + price +
                ", cover '" + cover + '\'' +
                '}';
    }
}
