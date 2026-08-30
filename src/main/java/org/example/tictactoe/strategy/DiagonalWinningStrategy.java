package org.example.tictactoe.strategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;
import org.example.tictactoe.models.Player;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStratgy {

    private HashMap<Character,Integer> LeftDiagonalMap;
    private HashMap<Character,Integer> RightDiagonalMap;
    private int size;

    public DiagonalWinningStrategy(int size) {
        this.LeftDiagonalMap = new HashMap<>();
        this.RightDiagonalMap = new   HashMap<>();
        this.size = size;
    }

    @Override
    public boolean checkWinner( Move move) {
        Player currPlayer = move.getPlayer();

        int row = move.getCell().getRow();
        int col = move.getCell().getColoum();

        Character character = currPlayer.getSymbol().getCharacter();

        if(row == col){
            if(!LeftDiagonalMap.containsKey(character)){
                LeftDiagonalMap.put(character,0);
            }
            LeftDiagonalMap.put(character,LeftDiagonalMap.get(character)+1);
        }

        if(row+col == size-1){
            if(!RightDiagonalMap.containsKey(character)){
                RightDiagonalMap.put(character,0);
            }
            RightDiagonalMap.put(character,RightDiagonalMap.get(character)+1);
        }

        return LeftDiagonalMap.get(character)==size || RightDiagonalMap.get(character)==size;

    }
}
