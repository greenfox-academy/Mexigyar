package com.sqltodoapp.sqltodoapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private  String title;
    private  boolean urgent;
    private  boolean done;


    public Todo() {
    }

    public Todo(String title) {
        this.id = id;
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return id +
                ". " + title + '\'';
    }
}
