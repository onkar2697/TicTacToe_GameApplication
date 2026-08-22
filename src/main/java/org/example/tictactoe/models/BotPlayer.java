package org.example.tictactoe.models;

import org.example.tictactoe.factory.BotPlayingStrategyFactory;
import org.example.tictactoe.models.enums.BotDifficultyLevel;
import org.example.tictactoe.models.enums.PlayerType;
import org.example.tictactoe.strategy.BotPlayingStrategy;
import org.example.tictactoe.strategy.EasyBotplayingStrategy;
import org.example.tictactoe.strategy.HardBotplayingStrategy;
import org.example.tictactoe.strategy.MediumBotplayingStrategy;

public class BotPlayer extends Player {
    private BotDifficultyLevel difficultyLevel;
    private BotPlayingStrategy playingStrategy;

    public BotPlayer(String name,
                     Symbol symbol,
                     PlayerType playerType,
                     BotDifficultyLevel difficultyLevel) {
        super(name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
        this.playingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);

        //Tis code voilates SRP(Single Responsibility Principle and OCP perfect use case of factory
        //Create Seperate Factory Class
//        if(difficultyLevel == BotDifficultyLevel.HARD){
//            this.playingStrategy = new HardBotplayingStrategy()
//        }
//        if (difficultyLevel == BotDifficultyLevel.EASY){
//            this.playingStrategy = new EasyBotplayingStrategy()
//        }
//        if(difficultyLevel == BotDifficultyLevel.MEDIUM){
//            this.playingStrategy = new MediumBotplayingStrategy()
//        }

    }

}
