package org.example.tictactoe.models;

import org.example.tictactoe.models.enums.PlayerType;

public abstract class Player {
    private String name;
    private Symbol Symbol;
    private PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        Symbol = symbol;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return Symbol;
    }

    public void setSymbol(Symbol symbol) {
        Symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
