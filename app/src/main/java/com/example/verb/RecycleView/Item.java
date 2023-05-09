package com.example.verb.RecycleView;

public class Item {

    String name;
    int score;
    int image;

    public Item(String name, int score, int image) {
        this.name = name;
        this.score = score;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmail() {
        return score;
    }

    public void setEmail(int score) {
        this.score = score;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
