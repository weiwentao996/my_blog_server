package com.blog.entity.PO;

import org.springframework.util.ObjectUtils;

import java.util.Date;

public class BasePO {

    protected Date createdTime;

    protected Date modifiedTime;

    protected Byte isDelete;

    public Date getCreatedTime() {
        return ObjectUtils.isEmpty(createdTime) ? new Date() : createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
