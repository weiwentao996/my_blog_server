package com.blog.service.impl;

import com.blog.dao.TypeMapper;
import com.blog.entity.DTO.TypeDTO;
import com.blog.entity.PO.TypePO;
import com.blog.service.TypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public int insertType(TypeDTO type) {
        TypePO typePO = new TypePO();
        BeanUtils.copyProperties(type,typePO);
        return typeMapper.insertType(typePO);
    }
}
