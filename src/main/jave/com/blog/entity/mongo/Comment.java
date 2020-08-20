package com.blog.entity.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//https://www.jianshu.com/p/05b9245e50fc Mongo实体类配置
@Data
@Document(collection = "comment")
public class Comment implements Serializable {
    @Id
    private String id;// key
    private String name; // 用户名
    private String avator; // 用户头像
    private String userCode;//用户id
    private String appCode;//用户id
    private String content;//内容
    private Integer commentNum;
    private Integer like;
    private Boolean inputShow = false;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date time ; // 时间
    private List<Reply> reply;
}