package com.qds.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * sql查询排序字段定义注解
 *
 * @author jony
 * @create on 2018/08/09 10:34
 * @email 1320765779@qq.com
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustOrderBy {
}
