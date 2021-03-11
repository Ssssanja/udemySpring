package com.zaurtrigulov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        Pet Cat = context.getBean("catBean", Pet.class);
//        Pet Cat1 = context.getBean("catBean", Pet.class);
//        System.out.println("Переменные ссылаются но один и тот же объект? " + (Cat==Cat1));
//        System.out.println(Cat);
//        System.out.println(Cat1);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
    }
}
