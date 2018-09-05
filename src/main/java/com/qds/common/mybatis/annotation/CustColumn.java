package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * MyBatis列名注解
 * @author jony
 * @date 2018/08/09 10:30
 * @e-mail 1320765779@qq.com
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustColumn {

    /**
     * 列名称
     * @return
     */
    String value() default "";

    /**
     * 标识是否精确查询，默认为false，为模糊查询，true为精确查询
     * @return
     */
    boolean precision() default false;
}
