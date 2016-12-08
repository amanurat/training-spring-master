package com.training.javaconfig.config;

import com.training.javaconfig.bean.EmployeeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
@Configuration
@ImportResource(locations = "classpath:spring-config.xml")
public class AppConfig {

    @Bean
    public EmployeeBean getEmployeeBean() {
        return new EmployeeBean("Assanai", "Manurat");
    }

}
