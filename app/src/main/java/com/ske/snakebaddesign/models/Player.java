package com.ske.snakebaddesign.models;

public class Player {
    private int position;
    private String color;

    public Player(int position, String color) {
        this.position = position;
        this.color = color;
    }
    public void setPosition(int  position) {
        this.position = position;
    }
    public int getPosition() {
        return this.position;
    }

    public String getColor() {return color;}
}
