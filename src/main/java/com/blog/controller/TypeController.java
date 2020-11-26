package com.blog.controller;

import com.blog.common.response.Response;
import com.blog.entity.DO.TypeDO;
import com.blog.entity.DTO.TypeDTO;
import com.blog.service.TypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/blog")
@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;
    
    @PostMapping("insertType")
    public Response insertType(@RequestBody TypeDO type) {
        TypeDTO typeDTO = new TypeDTO();
        BeanUtils.copyProperties(type, typeDTO);
        typeService.insertType(typeDTO);
        return new Response("成功",Response.ok);
    }

}
