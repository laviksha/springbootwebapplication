package com.gfg.laviksha.springbootwebapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

    @Entity  //jpa will make it entity
public class Author {
    @Id
    private long id;
    private String firstName,lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
