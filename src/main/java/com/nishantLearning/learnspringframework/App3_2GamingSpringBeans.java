package com.nishantLearning.learnspringframework;

import com.nishantLearning.learnspringframework.game.GameRunner;
import com.nishantLearning.learnspringframework.game.GamingConsole;
import com.nishantLearning.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nishantLearning.learnspringframework.game")
public class App3_2GamingSpringBeans {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App3_2GamingSpringBeans.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
