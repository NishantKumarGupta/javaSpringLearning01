package com.nishantLearning.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        /*
            Steps involved for making a spring context manage something
            1. Launch a spring context
            2. Configure the things we want the spring framework to manage - @Configuration
         */

        //Launching the spring context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("addressLine"));
            System.out.println("------------------------");
            System.out.println(context.getBean(Address.class));
            System.out.println("------------------------");
//        System.out.println(context.getBean(NishantClass.class));
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            for (String s : context.getBeanDefinitionNames()) {
                System.out.println(s);
            }
        }
    }
}
