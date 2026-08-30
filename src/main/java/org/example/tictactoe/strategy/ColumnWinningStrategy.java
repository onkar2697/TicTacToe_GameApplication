package org.example.tictactoe.strategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;
import org.example.tictactoe.models.Player;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStratgy {
    //Coloum Hashmaps - 3
//Row HashMaps -3
    private HashMap<Character, Integer> ColMap[];
    private int size;

    public ColumnWinningStrategy() {
        this.size = size;
        this.ColMap = new HashMap[size];

        for (int i = 0; i < size; i++) {
            ColMap[i] = new HashMap<>();
        }
    }

    @Override
    public boolean checkWinner(Move move) {
        //Get the current player  and current row
        Player currentPlayer = move.getPlayer();
        int row = move.getCell().getColoum();

        HashMap<Character, Integer> CurrColMap = ColMap[row];

        Character character = currentPlayer.getSymbol().getCharacter();

        if (!CurrColMap.containsKey(character)) {
            CurrColMap.put(character, 0);
        }
        CurrColMap.put(character, CurrColMap.get(character) + 1);

        return CurrColMap.get(character) == size;
    }
}