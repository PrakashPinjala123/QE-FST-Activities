
package com.example;

abstract class Book {
    protected String title;

    abstract void setTitle(String s);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        Book book = new MyBook();
        book.setTitle("Harry Potter");
        System.out.println("Book title is: " + book.getTitle());
    }
}
