package org.example.tictactoe.strategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public class ColumnWinningStrategy implements WinningStratgy{
    //Coloum Hashmaps - 3

    @Override
    public boolean checkWinner(Move move, Board board) {
        return false;
    }
}
