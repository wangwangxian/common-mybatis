package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * 一对一的映射关系
 *
 * @author wangwagxian
 * @date 2018/08/09 13:09
 * @email wangwangxian@qding.me
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustOneToOne {
    /**
     * 一对多关系里面 自己的关联字段
     *
     * @return
     */
    String refrenceOwnField();

    /**
     * 一对一关系里面 另一个实体的查询字段
     *
     * @return
     */
    String refrenceOtherField();

    /**
     * 另一个实体是不是主键,默认false
     *
     * @return
     */
    boolean primary() default false;
}
