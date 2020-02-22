package com.example.interview.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.interview.common.HttpResult;
import com.example.interview.pojo.User;
import com.example.interview.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class TestController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    @ApiOperation("添加用户")
    public HttpResult addUser(@RequestBody String json){
        User user = JSONObject.toJavaObject(JSON.parseObject(json), User.class);
        if (null == user){
            throw new NullPointerException();
        }
        userService.addUser(user);
        return HttpResult.builder().code(200).msg("success").build();
    }


    @PostMapping("/deleteUser")
    @ApiOperation("删除用户")
    public HttpResult deleteUser(@RequestBody String json){
        User user = JSONObject.toJavaObject(JSON.parseObject(json), User.class);
        if (null == user){
            throw new NullPointerException();
        }
        userService.deleteUser(user);
        return HttpResult.builder().code(200).msg("success").build();
    }


    @PostMapping("/updateUser")
    @ApiOperation("修改用户")
    public HttpResult updateUser(@RequestBody String json){
        User user = JSONObject.toJavaObject(JSON.parseObject(json), User.class);
        if (null == user){
            throw new NullPointerException();
        }
       int count =  userService.updateUser(user);
        if (count  == 0){
            return HttpResult.builder().code(403).msg("fail").build();
        }
        return HttpResult.builder().code(200).msg("success").build();
    }


    @PostMapping("/queryUser")
    @ApiOperation("查询用户")
    public HttpResult queryUser(@RequestBody String json){
        User user = JSONObject.toJavaObject(JSON.parseObject(json), User.class);
        if (null == user){
            throw new NullPointerException();
        }
        User user1 = userService.queryUserById(user.getId());
        return HttpResult.builder().code(200).msg("success").data(user1).build();
    }



}
