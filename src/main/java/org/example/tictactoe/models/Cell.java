package org.example.tictactoe.models;

import org.example.tictactoe.models.enums.CellState;

public class Cell {

    private int row;
    private int coloum;
    private CellState state;
    private Player player;

    public Cell(int row, int coloum) {
        this.row = row;
        this.coloum = coloum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColoum() {
        return coloum;
    }

    public void setColoum(int coloum) {
        this.coloum = coloum;
    }

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
