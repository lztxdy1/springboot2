package com.wang.config;

import com.wang.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


/**
 *  1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 *  2、配置类本身也是组件
 *  3、proxyBeanMethods：代理bean的方法
 *  Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *  Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *  组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *  4、@Import({User.class, DBHelper.class}) 给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 *  5、@ImportResource("classpath:beans.xml")导入Spring的配置文件，
 *
 */
@Configuration
public class MyConfig {

    @Bean
    public Car myCar() {

        return new Car("特斯拉", 300000);
    }
}
