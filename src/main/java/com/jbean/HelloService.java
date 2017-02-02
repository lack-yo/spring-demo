package com.jbean;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/2.
 */
@Service
public class HelloService {
    public String sayHello(String text){
        return "Hello" + text;
    }
}
