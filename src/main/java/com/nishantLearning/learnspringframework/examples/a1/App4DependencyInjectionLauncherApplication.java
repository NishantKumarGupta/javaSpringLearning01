package com.nishantLearning.learnspringframework.examples.a1;

import com.nishantLearning.learnspringframework.game.GameRunner;
import com.nishantLearning.learnspringframework.game.GamingConsole;
import com.nishantLearning.learnspringframework.game.PacmanGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Component
class YourBusinessClass{
//    The method of autowiring below is example of field injection which uses reflection (we are injectiing beans
//    directly to the fields)
//    @Autowired
//    Dependency1 dependency1;
//
//    @Autowired
//    Dependency2 dependency2;

    Dependency1 dependency1;
    Dependency2 dependency2;


    /*
    This is second type of dependency injection named setter injection(we are injecting the
    beans to the setter parameters)

    @Autowired
    public void setDependency1(Dependency1 dependency1){
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2){
        this.dependency2 = dependency2;
    }

     */

    //The method below is third type of dependency injection named constructor injection(here autowired is not
//    mandatory as spring automatically calls constructor for injection)
//    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Configuration
@ComponentScan
public class App4DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App4DependencyInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
