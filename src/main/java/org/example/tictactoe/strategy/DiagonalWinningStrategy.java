package org.example.tictactoe.strategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public class DiagonalWinningStrategy implements WinningStratgy {

    @Override
    public boolean checkWinner( Move move, Board board) {
        return false;
    }
}
