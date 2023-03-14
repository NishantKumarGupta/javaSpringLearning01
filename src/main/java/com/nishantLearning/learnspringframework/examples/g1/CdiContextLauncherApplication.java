package com.nishantLearning.learnspringframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named //Jakarta EE equivalent of component
class BusinessService{
    private DataServiceg1 dataServiceg1;

//    @Autowired
    @Inject //Jakarta EE equivalent of autowired
    public void setDataServiceg1(DataServiceg1 dataServiceg1) {
        System.out.println("setter injection");
        this.dataServiceg1 = dataServiceg1;
    }

    public DataServiceg1 getDataServiceg1() {
        return dataServiceg1;
    }
}

//@Component
@Named
class DataServiceg1{

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
