package com.blog.entity.PO;

import org.springframework.util.ObjectUtils;

import java.util.Date;

public class BasePO {

    protected Date createTime;

    protected Date modifiedTime;

    protected Byte isDelete;

    public Date getCreateTime() {
        return ObjectUtils.isEmpty(createTime) ? new Date() : createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return ObjectUtils.isEmpty(modifiedTime) ? new Date() : modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

}
