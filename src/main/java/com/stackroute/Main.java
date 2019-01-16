package com.stackroute;

import com.stackroute.Config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println(context.getBean("movie"));
        System.out.println(context.getBean("movieOne"));
        System.out.println(context.getBean("movieTwo"));
    }
}
