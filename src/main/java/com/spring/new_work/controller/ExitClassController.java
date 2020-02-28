package com.spring.new_work.controller;
import com.alibaba.fastjson.JSON;
import com.spring.new_work.entity.UserInfo;
import com.spring.new_work.mapper.ClassroomMapper;
import com.spring.new_work.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class ExitClassController {
    @Autowired
    ClassroomMapper classroomMapper;
    @Autowired
    UserMapper userMapper;


    @ResponseBody
    @RequestMapping(value = "/ExitClass",method = RequestMethod.POST)
    public String Exit(@RequestBody UserInfo userInfo){
        if (userInfo!=null){
            String classroom_id=userInfo.getClassroom_id();
            String id=userInfo.getId();
            userMapper.delet(id);
            classroomMapper.exitclass(classroom_id);
            return JSON.toJSONString( "T");
        }
        return JSON.toJSONString( "F");
    }
}
