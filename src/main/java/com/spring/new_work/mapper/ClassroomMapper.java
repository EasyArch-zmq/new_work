package com.spring.new_work.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClassroomMapper {

    void exitclass(String classroom_id);
}
