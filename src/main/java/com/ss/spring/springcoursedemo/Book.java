package com.ss.spring.springcoursedemo;

import org.springframework.stereotype.Repository;

public class Book
{
    long id;
    String name;
    String author;

    public Book(long id, String name, String author)
    {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        /**
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
         */

        return String.format("Book[id=%s, name=%s, author=%s]");
    }
}
