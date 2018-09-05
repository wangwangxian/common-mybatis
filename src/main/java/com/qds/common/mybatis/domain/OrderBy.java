package com.qds.common.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.qds.common.mybatis.annotation.CustOrderBy;

/**
 * 排序属性
 * @author jony
 * @date 2018/08/09 10:30
 * @e-mail 1320765779@qq.com
 */
public abstract class OrderBy extends GsonTool {

    @CustOrderBy
    @Expose(serialize = false,deserialize = false)
    private String orderBy;

    @JsonIgnore
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
