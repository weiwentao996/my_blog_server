package com.blog.common.response;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Response {
    public final static int ok = 10000;
    public final static int fail = 20000;
    private Object data;
    private Integer status;

    public Response() {

    }
    public Response(Integer status) {
        this.status = status;
    }

    public Response(Object data, Integer status) {
        this.data = data;
        this.status = status;
    }
}
