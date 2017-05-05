package com.training;

import com.training.controller.GreetingController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingApp {

    public static void main(String[] args) throws Exception {

   /*     BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("/Users/amanurat/Traning/Courses/Spring-Course/training-spring-master/01-why-spring/02-with-spring-di/src/main/resources/spring-config.xml"));
        GreetingController controller = beanFactory.getBean(GreetingController.class);
        System.out.println(controller.say());
*/

  /*      ApplicationContext context = new FileSystemXmlApplicationContext("//Users/amanurat/Traning/Courses/Spring-Course/training-spring-master/01-why-spring/02-with-spring-di/src/main/resources/spring-config.xml");
        GreetingController controller = context.getBean(GreetingController.class);
        System.out.println(controller.say());
*/

      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingController controller = context.getBean(GreetingController.class);
        System.out.println(controller.say());

    }
}
