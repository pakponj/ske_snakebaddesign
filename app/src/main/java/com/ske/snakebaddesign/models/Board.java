package com.ske.snakebaddesign.models;

/**
 * Created by Administrator on 14/3/2559.
 */
public class Board {

    private Player p1;
    private Player p2;
//    private int p1Position;
//    private int p2Position;
    private static Board instance;
    private int size;

    private Board() {
        p1 = new Player(0, "White");
        p2 = new Player(0, "Black");
//        p1Position = 0;
//        p2Position = 0;
    }

    public static Board getInstance() {
        if(instance == null) instance = new Board();
        return instance;
    }

    public void setBoardSize(int size) {
        this.size = size;
    }

    public void setP1Position(int position) { p1.setPosition(position); }

    public void setP2Position(int position) { p2.setPosition(position); }

    public int getBoardSize() {
        return size;
    }

    public int getP1Position() {
        return p1.getPosition();
    }

    public int getP2Position() {
        return p2.getPosition();
    }

    public String getP1Color() {return p1.getColor();}

    public String getP2Color() {return p2.getColor();}

}
