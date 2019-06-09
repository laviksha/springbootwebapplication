package com.gfg.laviksha.springbootwebapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity     //jpa will make it entity
public class Book {
    @Id
    private long id;
    private String title;
    private String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
