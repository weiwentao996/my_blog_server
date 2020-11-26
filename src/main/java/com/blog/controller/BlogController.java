package com.blog.controller;

import com.blog.common.response.Response;
import com.blog.entity.DO.EssayDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/blog")
@RestController
public class BlogController {

    @PostMapping("addEssay")
    public Response addEssay(@RequestBody EssayDO essay) {

        return new Response();
    }

}
