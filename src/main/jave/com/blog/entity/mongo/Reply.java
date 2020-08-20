package com.blog.entity.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
@Document(collection = "reply")
@Data
public class Reply implements Serializable {
    @Id
    private String id;// key
    private String commentId;
    private String replyId;
    private String from;//回复人
    private String fromCode;//回复人code
    private String avator; // 用户头像
    private String to;//被回复人姓名
    private String toCode;//被回复人code
    private String content;//内容
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date time ; // 时间
    private Integer commentNum;//回复数
    private Integer like;
    private Boolean inputShow = false;

}
