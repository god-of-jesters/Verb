package com.example.verb.DB;

import androidx.annotation.NonNull;

public class User {
    private int id;
    private String name;
    private String password;
    private int score;

    public User(int id, String name, String password, int score) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.score = score;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getScore() {
        return score;
    }

}
