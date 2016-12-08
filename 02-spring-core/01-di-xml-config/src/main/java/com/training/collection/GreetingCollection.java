package com.training.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
public class GreetingCollection {



    private List<String> languageList;

    private Set<String> languageSet;

    private Map<String, String> languageMap;

    private String message;

    public GreetingCollection() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    public Set<String> getLanguageSet() {
        return languageSet;
    }

    public void setLanguageSet(Set<String> languageSet) {
        this.languageSet = languageSet;
    }


    public Map<String, String> getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map<String, String> languageMap) {
        this.languageMap = languageMap;
    }

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("collection/01-spring-collection-config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("collection/02-spring-collection-namespace-config.xml");
        GreetingCollection bean = context.getBean("greetingCollection",GreetingCollection.class);
        System.out.println(bean.getMessage());
        System.out.println(bean.getLanguageList());
        System.out.println(bean.getLanguageSet());
        System.out.println(bean.getLanguageMap());


        GreetingCollection example1 = context.getBean("greetingCollection2", GreetingCollection.class);
        System.out.println(example1.getMessage());


    }
}
