package com.training.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amanurat on 3/9/2016 AD.
 */
public class GreetingConstructor {

    private String text = "default constructor text";

    public GreetingConstructor() {
    }

    public GreetingConstructor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingConstructor bean = context.getBean(GreetingConstructor.class);

        System.out.println(bean.getText());
    }
}
