package com.training;

/**
 * Created by amanurat on 3/9/2016 AD.
 */
public class GreetingController {

    private GreetingEnglishService greetingEnglishService;

    private GreetingThaiService greetingThaiService;

    public GreetingController() {
        greetingEnglishService = new GreetingEnglishService();
        greetingThaiService = new GreetingThaiService();
    }

    public String say() {
//        return greetingEnglishService.say();
        return greetingThaiService.say();
    }


    public static void main(String[] args) {
        GreetingController greetingController = new GreetingController();
        System.out.println(greetingController.say());
    }
}
