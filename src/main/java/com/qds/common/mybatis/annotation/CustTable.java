package com.qds.common.mybatis.annotation;


import java.lang.annotation.*;

/**
 * Mybatis的表名的注解
 *
 * @author jony
 * @create on 2018/08/09 10:34
 * @email 1320765779@qq.com
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustTable {
    /**
     * 表名称
     * @return
     */
    String value() default "";
}
