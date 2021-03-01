package com.st.hellomac.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
@Api(tags = "测试类",value = "测试一下")
public class HelloController {

    @RequestMapping("/hello")
    @ApiOperation(value = "hello接口",notes = "备注")
    public Object say(){
        return new String("hello");
    }
}
