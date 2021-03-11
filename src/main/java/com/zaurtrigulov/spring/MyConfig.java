package com.zaurtrigulov.spring;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.zaurtrigulov.spring")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
//    @Bean
//    public Pet DogBean(){
//        return new Dog();
//    }
}
