package com.komkrit.todolistdemo;

import java.io.Serializable;

/**
 * Created by Windows10 on 1/3/2560.
 */

public class TodoList implements Serializable {
    private int id;
    private String todoText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }
}
