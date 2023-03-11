package com.nishantLearning.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){

}

record Address(String firstLine, String city){

}


class NishantClass{
    public int ape = 20;
    public NishantClass(int ape){
        this.ape = ape;
    }
}

@Configuration
public class HelloWorldConfiguration {
    int age = 15;

    @Bean
    public String name(){
        return "Nishant";
    }

    @Bean
    public int age(){
        return age;
    }

    @Bean
    public Person person(){
        var person = new Person("Nishant", 22);
        return person;
    }

    @Bean(name = "addressLine")
    public Address address(){
        return new Address("Dwarka mor me ghar hai", "New Delhi");
    }

    @Bean
    public NishantClass nishant(){
        return new NishantClass(25);
    }
}
