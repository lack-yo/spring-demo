package com.lou.controller;

import com.lou.aop.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/2/8.
 */
@Controller
public class HelloControlller {
    private static Logger logger = LoggerFactory.getLogger(HelloControlller.class);

    @RequestMapping("/hello.htm")
    @ResponseBody
    @Log
    public String hello(HttpServletRequest request){
        logger.info("######进入请求");
        return "hello";
    }
}
