package com.nishantLearning.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Upar jaara hu");
    }
    public void down(){
        System.out.println("Niche jaara hu");
    }
    public void left(){
        System.out.println("Bhai guess kar kaha jaunga..left hi jaunga na");
    }
    public void right(){
        System.out.println("Right :)");
    }
}
