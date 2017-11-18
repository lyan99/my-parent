package com.chen.my.manage.annotation;

import java.lang.annotation.*;

/**
 * 自定义注释 用于描述操作日志 
 * 
 *
 * @author chenlei 
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented  
@Inherited
public @interface OpLogger
{
    /**
     * 模块名称
     * @return
     */
    String moduleName() default "";
    
    /**
     * 操作类型
     * @return
     */
    byte opType();
}
