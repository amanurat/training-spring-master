package com.training.scope;

import com.training.di.constructor.GreetingConstructor;
import com.training.di.setter.GreetingSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amanurat on 3/9/2016 AD.
 */
public class GreetingScope {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        GreetingConstructor greetingConstructor1 = context.getBean(GreetingConstructor.class);
        GreetingConstructor greetingConstructor2 = context.getBean(GreetingConstructor.class);
        System.out.println("Bean singleton scope : "+ (greetingConstructor1 == greetingConstructor2));


        GreetingSetter greetingSetter1 = context.getBean(GreetingSetter.class);
        GreetingSetter greetingSetter2 = context.getBean(GreetingSetter.class);
        System.out.println("Bean prototype scope : "+ (greetingSetter1 == greetingSetter2));
    }

}
