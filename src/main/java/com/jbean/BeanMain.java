package com.jbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/2/2.
 */
public class BeanMain {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        HelloFunction func = (HelloFunction) context.getBean("helloFunction");
        func.useHello();
    }
}
