package com.nishantLearning.learnspringframework.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationServiceMainClass {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(BusinessCalculationServiceMainClass.class)){
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
