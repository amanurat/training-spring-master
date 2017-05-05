package com.training.controller;

import com.training.service.GreetingEnglishServiceImpl;
import com.training.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingController {

    private static Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    private GreetingService greetingService;

    public GreetingController() {
        LOGGER.info("*** GreetingController ***");
    }

    public String say() {
        return greetingService.say();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public static void main(String[] args) {
        GreetingController greetingController = new GreetingController();
        greetingController.setGreetingService(new GreetingEnglishServiceImpl());
        System.out.println(greetingController.say());
    }
}
