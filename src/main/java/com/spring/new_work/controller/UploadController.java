package com.spring.new_work.controller;

import com.alibaba.fastjson.JSON;
import com.spring.new_work.entity.UserInfo;
import com.spring.new_work.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UploadController {

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/Upload_information",method = RequestMethod.POST)
    public String Upload(@RequestBody UserInfo userInfo){
        if (userInfo!=null){
            userMapper.update(userInfo);
            return JSON.toJSONString( "T");

        }
        return JSON.toJSONString( "F");


    }

}
