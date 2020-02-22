package com.example.interview.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = "跳转控制器", description = "页面跳转")
public class IndexController {

    @ApiOperation("跳转到首页")
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
