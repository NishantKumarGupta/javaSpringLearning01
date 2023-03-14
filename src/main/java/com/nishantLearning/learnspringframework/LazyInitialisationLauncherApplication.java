package com.nishantLearning.learnspringframework;

import com.nishantLearning.learnspringframework.game.GameRunner;
import com.nishantLearning.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Doing something something");
        this.classA = classA;
    }

    public void doSomethingMore(){
        System.out.println("Doing something more brother!");
    }
}


@Configuration
@ComponentScan
public class LazyInitialisationLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitialisationLauncherApplication.class)){
            System.out.println("Context bann gaya");
            context.getBean(ClassB.class).doSomethingMore();
        }
    }
}
