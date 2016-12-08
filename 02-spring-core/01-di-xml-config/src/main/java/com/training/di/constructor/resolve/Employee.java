package com.training.di.constructor.resolve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amanurat on 3/9/2016 AD.
 */
public class Employee {

    private String name;
    private Integer age;
    private Boolean married;

    public Employee(String name, Integer age, Boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Employee bean = context.getBean(Employee.class);
        System.out.println(bean);
    }

}

