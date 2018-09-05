package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * 一对多映射关系
 * 只支持Set List Array的格式
 *
 * @author jony
 * @date 2018/08/09 11:56
 * @e-mail 1320765779@qq.com
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustOneToMany {


    /**
     * one的关联字段
     *
     * @return
     */
    String oneField();

    /**
     * many的查询字段
     *
     * @return
     */
    String manyField();

}
