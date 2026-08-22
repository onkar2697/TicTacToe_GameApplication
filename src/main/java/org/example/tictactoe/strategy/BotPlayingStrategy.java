package org.example.tictactoe.strategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
