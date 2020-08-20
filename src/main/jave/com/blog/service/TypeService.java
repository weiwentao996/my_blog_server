package com.blog.service;

import com.blog.entity.DTO.TypeDTO;

public interface TypeService {

    /**
     * 添加分类
     * @param type
     * @return
     */
   int insertType(TypeDTO type);
}
