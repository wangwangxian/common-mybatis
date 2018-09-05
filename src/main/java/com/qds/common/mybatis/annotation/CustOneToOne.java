package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * 一对一的映射关系
 *
 * @author jony
 * @date 2018/08/09 13:09
 * @email 1320765779@qq.com
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustOneToOne {
    /**
     * 自己的关联字段
     *
     * @return
     */
    String oneField();

    /**
     * 另一个实体的查询字段
     *
     * @return
     */
    String otherOneField();

    /**
     * 另一个实体是不是主键,默认false
     *
     * @return
     */
    boolean otherIsPrimary() default false;
}
