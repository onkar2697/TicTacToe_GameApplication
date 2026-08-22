package org.example.tictactoe.factory;

import org.example.tictactoe.models.enums.BotDifficultyLevel;
import org.example.tictactoe.strategy.BotPlayingStrategy;
import org.example.tictactoe.strategy.EasyBotplayingStrategy;
import org.example.tictactoe.strategy.HardBotplayingStrategy;
import org.example.tictactoe.strategy.MediumBotplayingStrategy;

public class BotPlayingStrategyFactory {
    //This factory will help us to create the corresponding bot playing strategy
    // based on the bot difficulty level


    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel  difficultyLevel){
        if(difficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotplayingStrategy();
        }
        else if(difficultyLevel.equals(BotDifficultyLevel.HARD)){
            return new HardBotplayingStrategy();
        }
        else{
            return new MediumBotplayingStrategy();
        }
    }
}
