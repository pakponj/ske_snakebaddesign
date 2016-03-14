package com.ske.snakebaddesign.controllers;

import com.ske.snakebaddesign.models.Board;

public class BoardController {

    private Board board;

    public BoardController() {
        board = Board.getInstance();
    }

    public void setBoardSize(int size) {
        board.setBoardSize(size);
    }

    public void setP1Position(int position) {
        board.setP1Position(position);
    }

    public void setP2Position(int position) {
        board.setP2Position(position);
    }

    public int getBoardSize() {
        return board.getBoardSize();
    }

    public int getP1Position() {
        return board.getP1Position();
    }

    public int getP2Position() {
        return board.getP2Position();
    }

    public int checkWin() {
        int boardSize = getBoardSize();
        if(getP1Position() == boardSize * boardSize - 1) return 1;
        else if(getP2Position() == boardSize * boardSize - 1) return 2;
        else return 0;
    }

    public void moveCurrentPiece(int turn, int value) {
        if(turn % 2 == 0) {
            setP1Position(adjustPosition(getP1Position(), value));
        }else {
            setP2Position(adjustPosition(getP2Position(), value));
        }
    }

    private int adjustPosition(int current, int distance) {
        current = current + distance;
        int boardSize = getBoardSize();
        int maxSquare = boardSize * boardSize - 1;
        if(current > maxSquare) current = maxSquare - (current - maxSquare);
        return current;
    }

}
