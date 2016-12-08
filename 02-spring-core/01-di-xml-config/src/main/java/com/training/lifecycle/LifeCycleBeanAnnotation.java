package com.training.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class LifeCycleBeanAnnotation {

    public LifeCycleBeanAnnotation() {
        System.out.println("call : constructor");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("call : @PostConstruct");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("call : @PreDestroy");
    }


}
