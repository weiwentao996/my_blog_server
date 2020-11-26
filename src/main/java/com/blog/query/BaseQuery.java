package com.blog.query;

import lombok.Data;

@Data
public class BaseQuery {
    public Integer pageSize = 10;
    public Integer currentPage = 1;
}
