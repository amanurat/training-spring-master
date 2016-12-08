package com.training.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amanurat on 3/9/2016 AD.
 */
public class GreetingSetter {

    private String text = "default setter text";

    private AnotherBean anotherBean;

    public GreetingSetter() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingSetter bean = context.getBean(GreetingSetter.class);

        System.out.println(bean.getText());

        System.out.println(bean.getAnotherBean());


    }


}
