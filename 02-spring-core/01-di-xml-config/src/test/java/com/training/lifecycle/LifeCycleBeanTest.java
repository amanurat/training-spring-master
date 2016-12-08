package com.training.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@ContextConfiguration(locations = "classpath:lifecycle/spring-lifecycle-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LifeCycleBeanTest {

    @Test
    public void testBeanLifeCycle() throws Exception {


    }
}