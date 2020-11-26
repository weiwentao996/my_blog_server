package com.blog.entity.VO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class EssayVO {
    private Long id;

    private String essayCode;

    private String title;

    private String userId;

    private String typeCode;


    private String context;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    protected Date createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEssayCode() {
        return essayCode;
    }

    public void setEssayCode(String essayCode) {
        this.essayCode = essayCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getcreatedTime() {
        return createdTime;
    }

    public void setcreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}