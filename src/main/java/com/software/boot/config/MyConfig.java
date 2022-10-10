package com.software.boot.config;

import com.software.boot.bean.Pet;
import com.software.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.配置类里面使用@bean标注在方法上给容器注册组件，默认也是单例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods:代理bean的方法
 */
@Configuration(proxyBeanMethods = true) //这是一个配置类 == 配置文件
public class MyConfig {

    @Bean //给容器添加组件。以方法名作为组建的id。返回类型就是组件类型。返回的值就是组件在容器中保存的实例
    public User user01(){
        return new User("张三",18);
    }

    @Bean
    public Pet cat(){
        return new Pet("tomcat");
    }
}
