package com.sumeet;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    private String name;

    @Id
    private int id;
    private String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }
}
