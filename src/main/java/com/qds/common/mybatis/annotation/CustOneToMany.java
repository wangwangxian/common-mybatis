package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * 一对多映射关系
 * 只支持Set List Array的格式
 *
 * @author wangwangxian
 * @date 2018/08/09 11:56
 * @e-mail wangwangxian@qding.me
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustOneToMany {


    /**
     * 一对多关系里面 one的关联字段
     *
     * @return
     */
    String refrenceOwnField();

    /**
     * 一对多关系里面 many的查询字段
     *
     * @return
     */
    String refrenceOtherField();

}
