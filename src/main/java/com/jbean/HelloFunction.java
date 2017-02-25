package com.jbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/2.
 */
@Service
public class HelloFunction {
    @Autowired
    private HelloService helloService;
    @Value("${number}")
    private String number;

    public void useHello(){
        System.out.println(helloService.sayHello("lily") + number);
    }
}
