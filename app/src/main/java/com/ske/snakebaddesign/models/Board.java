package com.ske.snakebaddesign.models;

/**
 * Created by Administrator on 14/3/2559.
 */
public class Board {

    private int p1Position;
    private int p2Position;
    private static Board instance;
    private int size;

    private Board() {
        p1Position = 0;
        p2Position = 0;
    }

    public static Board getInstance() {
        if(instance == null) instance = new Board();
        return instance;
    }

    public void setBoardSize(int size) {
        this.size = size;
    }

    public void setP1Position(int position) {
        p1Position = position;
    }

    public void setP2Position(int position) {
        p2Position = position;
    }

    public int getBoardSize() {
        return size;
    }

    public int getP1Position() {
        return p1Position;
    }

    public int getP2Position() {
        return p2Position;
    }

}
