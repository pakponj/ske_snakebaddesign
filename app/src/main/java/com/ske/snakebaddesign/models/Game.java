package com.ske.snakebaddesign.models;

import com.ske.snakebaddesign.controllers.BoardController;

public class Game {

    private BoardController controller;
    private static Game instance;
    private int turn;
    private int winner;

    private Game() {
        turn = 0;
        controller = new BoardController();
    }

    public static Game getInstance() {
        if(instance == null) instance = new Game();
        return instance;
    }

    public void resetGame() {
        turn = 0;
        controller.setP1Position(0);
        controller.setP2Position(0);
        controller.setBoardSize(6);
    }

    public int takeTurn() {
        return Die.getNumber();
    }

    public int getTurn() { return turn; }

    public void moveCurrentPiece(int value) {
        controller.moveCurrentPiece(turn, value);
        checkWin();
        turn++;
    }

    public void checkWin() {
        winner = controller.checkWin();
    }

    public String getMsg() {
        if(winner == 1) return "Player 1 won!";
        else if(winner == 2) return "Player 2 won!";
        else return "";
    }

    public int getBoardSize() {
        return controller.getBoardSize();
    }

    public int getP1Position() {
        return controller.getP1Position();
    }

    public int getP2Position() {
        return controller.getP2Position();
    }

    public BoardController getController() {
        return controller;
    }

}
