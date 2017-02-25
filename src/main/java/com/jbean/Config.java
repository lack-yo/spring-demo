package com.jbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Administrator on 2017/2/2.
 */
@Configuration
@ComponentScan("com.jbean")
@PropertySource("classpath:value.properties")
public class Config {

    /**
     * 将一个资源文件载入需要配置相关cofig的bean
     *
     * @return 配置bean
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
