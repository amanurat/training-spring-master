package com.training.lifecycle;

public class LifeCycleBean {
//public class LifeCycleBean implements InitializingBean, DisposableBean {

    public LifeCycleBean() {
        System.out.println("call : constructor");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("call : afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("call : destroy");
    }


}
