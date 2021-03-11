package com.epam.elearn.simplestClasses;

/*
9. Создать класс Book, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:

a) список книг заданного автора;

b) список книг, выпущенных заданным издательством;

c) список книг, выпущенных после заданного года.
 */

public class Ninth {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book(1, "Gogol", "Star", 2020, 310, 57, "hard");
        books[1] = new Book(2, "Gomer", "Knowledge", 2009, 31, 57, "soft");
        books[2] = new Book(3, "Gogol", "Knowledge", 2012, 240, 57, "soft");
        books[3] = new Book(4, "Gagarin", "Knowledge", 2012, 50, 57, "soft");
        books[4] = new Book(5, "Gordon", "Knowledge", 1999, 130, 57, "soft");
        books[5] = new Book(6, "Gordon", "Science", 1990, 3, 57, "hard");
        books[6] = new Book(7, "Gagarin", "Science", 2002, 33, 57, "soft");
        books[7] = new Book(8, "Gomer", "Science", 2010, 687, 57, "soft");
        books[8] = new Book(9, "Gomer", "Star", 1981, 358, 57, "hard");
        books[9] = new Book(10, "Gomer", "Star", 1994, 222, 57, "hard");

        // a) список книг заданного автора;
        Book.findAuthor(books, "gomer");
        System.out.println("************");
        Book.findAuthor(books, "Tolstoi");
        System.out.println("************");

        // b) список книг, выпущенных заданным издательством;
        Book.findPublisher(books, "Star");
        System.out.println("*************");
        Book.findPublisher(books, "hope");
        System.out.println("**************");

        // c) список книг, выпущенных после заданного года.
        Book.moreAge(books, 2000);
        System.out.println("**************");
        Book.moreAge(books, 2021);


    }
}

class Book {
    private int id;
    private String author;
    private String publisher;
    private int age;
    private int page;
    private int price;
    private String bindingType;

    public Book() {
    }

    public Book(int id, String author, String publisher, int age, int page, int price, String bindingType) {
        this.id = id;
        this.author = author;
        this.publisher = publisher;
        this.age = age;
        this.page = page;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", age=" + age +
                ", page=" + page +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }


    // a) список книг заданного автора;

    public static void findAuthor(Book[] books, String author) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equalsIgnoreCase(author)) {
                System.out.println(books[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Увы данного автора нет ");
        }
    }

    // b) список книг, выпущенных заданным издательством;

    public static void findPublisher(Book[] books, String publisher) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].publisher.equalsIgnoreCase(publisher)) {
                System.out.println(books[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Данного издания не существует ");
        }
    }

    // c) список книг, выпущенных после заданного года.

    public static void moreAge(Book[] books, int age) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].age > age) {
                System.out.println(books[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Книг выданных после этого года нет");
        }
    }
}
