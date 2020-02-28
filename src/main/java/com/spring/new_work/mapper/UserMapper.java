package com.spring.new_work.mapper;

import com.spring.new_work.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    void update(UserInfo userInfo);

    void delet(String id);


}
