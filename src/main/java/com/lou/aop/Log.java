package com.lou.aop;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/2/8.
 * 扫描需要记录特殊log的
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Log {
}
