package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * MyBatis主键ID的注解
 * @author wangwangxian
 * @date 2018/08/09 10:30
 * @e-mail wangwangxian@qding.me
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustId {
    /**
     * 主键id列名
     * @return
     */
    String value() default "";
}
