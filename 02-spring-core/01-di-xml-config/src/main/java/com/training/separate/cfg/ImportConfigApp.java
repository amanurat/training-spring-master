package com.training.separate.cfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amanurat on 3/9/2016 AD.
 */
public class ImportConfigApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("import-config/parent.xml");

        BeanA beanA = context.getBean(BeanA.class);

        BeanB beanB = context.getBean(BeanB.class);

        System.out.println(beanA);
        System.out.println(beanB);
    }
}
