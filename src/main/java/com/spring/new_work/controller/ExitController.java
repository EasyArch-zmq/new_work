package com.spring.new_work.controller;

import com.alibaba.fastjson.JSON;
import com.spring.new_work.entity.UserInfo;
import com.spring.new_work.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExitController {
    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/Exit" ,method = RequestMethod.POST)
    public String Exit(@RequestBody UserInfo userInfo){
        if (userInfo!=null){
            String id=userInfo.getId();
            userMapper.delet(id);
            return JSON.toJSONString( "T");
        }
        return JSON.toJSONString( "F");
    }
}
