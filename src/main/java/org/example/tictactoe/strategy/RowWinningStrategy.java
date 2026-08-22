package org.example.tictactoe.strategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;
import org.example.tictactoe.models.Player;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStratgy {
    //Row HashMaps -3
    private HashMap<Character, Integer> rowMaps[];
    private int size;

    public RowWinningStrategy() {
        this.rowMaps = new HashMap[size];

        for(int i=0;i < size;i++){
            rowMaps[i] = new HashMap<>();
        }
    }

    @Override
    public boolean checkWinner(Move move, Board board) {
        //Get the current player  and current row
        Player currentPlayer = move.getPlayer();
        int row =  move.getCell().getRow();

        HashMap<Character, Integer> currRowMap = rowMaps[row];

        Character character = currentPlayer.getSymbol().getCharacter();

        if(currRowMap.containsKey(character)){
            currRowMap.put(character, currRowMap.getOrDefault(character,0)+1);
        }
//tesr
        return false;
    }
}
