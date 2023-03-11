package com.nishantLearning.learnspringframework;

import com.nishantLearning.learnspringframework.game.GameRunner;
import com.nishantLearning.learnspringframework.game.GamingConsole;
import com.nishantLearning.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;

public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunnerParameter(GamingConsole game){
        return new GameRunner(game);
    }
}
