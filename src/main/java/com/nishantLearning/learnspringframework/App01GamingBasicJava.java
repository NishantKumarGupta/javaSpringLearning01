package com.nishantLearning.learnspringframework;

import com.nishantLearning.learnspringframework.game.GameRunner;
import com.nishantLearning.learnspringframework.game.MarioGame;
import com.nishantLearning.learnspringframework.game.PacmanGame;
import com.nishantLearning.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
