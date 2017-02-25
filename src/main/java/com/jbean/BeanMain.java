package com.jbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/2/2.
 */
public class BeanMain {
    private static final Logger logger = LoggerFactory.getLogger(BeanMain.class);
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        HelloFunction func = (HelloFunction) context.getBean("helloFunction");
        logger.info("success");
        func.useHello();
    }
}
