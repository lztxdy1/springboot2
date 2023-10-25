package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationRun {

    public static void main(String[] args) {

        // 1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(ApplicationRun.class, args);

        // 2.查看IOC容器组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
