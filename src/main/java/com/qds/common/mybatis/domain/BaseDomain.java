package com.qds.common.mybatis.domain;

import com.qds.common.mybatis.annotation.CustColumn;
import com.qds.common.mybatis.annotation.CustId;

import java.util.Date;

/**
 * 基础类的实体
 * 数据表中公共属性（ID、创建者、修改者、创建时间、修改时间等）
 * @author jony
 * @date 2018/08/09 16:29
 * @e-mail 1320765779@qq.com
 */
public abstract class BaseDomain extends OrderBy {
    /**
     * 实体的ID
     */
    @CustId("id")
    private String id;
    /**
     * 创建时间
     */
    @CustColumn("create_time")
    private Date createTime;
    /**
     * 创建人
     */
    @CustColumn("create_by")
    private String createBy;
    /**
     * 修改时间
     */
    @CustColumn("update_time")
    private Date updateTime;
    /**
     * 修改人
     */
    @CustColumn("update_by")
    private String updateBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
